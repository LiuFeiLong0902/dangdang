package org.tarena.dang.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.tarena.dang.pojo.User;
import org.tarena.dang.util.Constant;


public class HibernateUserDAO extends BaseDAO implements UserDAO {
	// 保存一个用户
	public void save(User user) throws Exception {
		// TODO Auto-generated method stub
		getSession().save(user);	
	}

	// 根据email查找用户
	public User findByEmail(String email) throws Exception {
		String hql = "from User where email=?";
		Query query = getSession().createQuery(hql);
		query.setString(0, email);
		User user = (User) query.uniqueResult();
		return user;
	}

	// 根据email查找用户
	public void findUserById(String email) throws Exception {
		// TODO Auto-generated method stub
		Session session = getSession();
		String hql = " from User u where u.email=? ";
		Query query = getSession().createQuery(hql);
		query.setString(0, email);
		User user = (User) query.uniqueResult();
		user.setIsEmailVerify(Constant.VERIFY_YES);
		session.saveOrUpdate(user);
	}

	// 根据邮箱名和密码判断该用户是否存在
	public User findUserByEmail(String userEmail)
			throws Exception {
		// 根据email判断该用户是否存在
		String hql = " from User u where u.email=?";
		Query query = getSession().createQuery(hql);
		query.setString(0, userEmail);
		User user = (User) query.uniqueResult();

		return user;
    
	}
    //修改当前用户的个人信息
	public void modifyUser(User user) throws Exception {
		String email = user.getEmail();
		String nickname = user.getNickname();
		String password = user.getPassword();
		String hql ="update User set nickname=?,password=? where email=?";
		Query query =getSession().createQuery(hql);
		query.setString(0,nickname);
		query.setString(1,password);
		query.setString(2,email);
		query.executeUpdate();
		
	}
}
