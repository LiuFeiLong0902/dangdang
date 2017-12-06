package org.tarena.dang.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.tarena.dang.pojo.User;
import org.tarena.dang.util.Constant;


public class HibernateUserDAO extends BaseDAO implements UserDAO {
	// ����һ���û�
	public void save(User user) throws Exception {
		// TODO Auto-generated method stub
		getSession().save(user);	
	}

	// ����email�����û�
	public User findByEmail(String email) throws Exception {
		String hql = "from User where email=?";
		Query query = getSession().createQuery(hql);
		query.setString(0, email);
		User user = (User) query.uniqueResult();
		return user;
	}

	// ����email�����û�
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

	// �����������������жϸ��û��Ƿ����
	public User findUserByEmail(String userEmail)
			throws Exception {
		// ����email�жϸ��û��Ƿ����
		String hql = " from User u where u.email=?";
		Query query = getSession().createQuery(hql);
		query.setString(0, userEmail);
		User user = (User) query.uniqueResult();

		return user;
    
	}
    //�޸ĵ�ǰ�û��ĸ�����Ϣ
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
