package org.tarena.dang.service;

import org.tarena.dang.dao.HibernateUserDAO;
import org.tarena.dang.dao.UserDAO;
import org.tarena.dang.pojo.User;
import org.tarena.dang.util.Constant;
import org.tarena.dang.util.EmailUtil;
import org.tarena.dang.util.MD5Util;
import org.tarena.dang.util.UUIDUtil;

public class UserServiceImpl implements UserService{

	public void regist(User user) throws Exception{
		//������ܴ���
		String newPwd = MD5Util.degist(user.getPassword());
		user.setPassword(newPwd);
		//������֤��
		String emailCode = UUIDUtil.generator();// �������һ��32λ��ͬ��������֤�룬��һ��uuid
		user.setEmailVerifyCode(emailCode);
		user.setUserIntegral(Constant.INTEGRAL_NORMAL);// ���û��ĵȼ�
		user.setIsEmailVerify(Constant.VERIFY_NO);// �Ƿ���������֤��VERIFY_NO��ʾ����δ��֤��VERIFY_YES��������֤
		user.setLastLoginTime(System.currentTimeMillis());// ���û�ע��ĵ�ǰʱ��
		//��userд��d_user��
		UserDAO userDao = new HibernateUserDAO();
		userDao.save(user);// �����user�����ݿ�
		//��������֤����û������ʼ�
		EmailUtil.sendEmail(user.getEmail(),user.getEmailVerifyCode());
		//����������֤ҳ��verify_form.jsp		
	}
    
	public void findUserById(String email) throws Exception {
		
		UserDAO userDao = new HibernateUserDAO();
		userDao.findUserById(email);
	}
//����email��ַ��������Ҹ��û�����֤���û��Ƿ����
	public User findByEmail(String userEmail)
			throws Exception {
		
		UserDAO userD = new HibernateUserDAO();
		User user = userD.findUserByEmail(userEmail);
		
		return user;
	}

}
