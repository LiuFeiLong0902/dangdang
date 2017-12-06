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
		//密码加密处理
		String newPwd = MD5Util.degist(user.getPassword());
		user.setPassword(newPwd);
		//生成验证码
		String emailCode = UUIDUtil.generator();// 随机生成一个32位不同的邮箱验证码，是一个uuid
		user.setEmailVerifyCode(emailCode);
		user.setUserIntegral(Constant.INTEGRAL_NORMAL);// 该用户的等级
		user.setIsEmailVerify(Constant.VERIFY_NO);// 是否已邮箱验证，VERIFY_NO表示邮箱未验证，VERIFY_YES邮箱已验证
		user.setLastLoginTime(System.currentTimeMillis());// 该用户注册的当前时间
		//将user写入d_user表
		UserDAO userDao = new HibernateUserDAO();
		userDao.save(user);// 保存该user到数据库
		//将邮箱验证码给用户发送邮件
		EmailUtil.sendEmail(user.getEmail(),user.getEmailVerifyCode());
		//进入邮箱验证页面verify_form.jsp		
	}
    
	public void findUserById(String email) throws Exception {
		
		UserDAO userDao = new HibernateUserDAO();
		userDao.findUserById(email);
	}
//根据email地址和密码查找该用户，验证该用户是否存在
	public User findByEmail(String userEmail)
			throws Exception {
		
		UserDAO userD = new HibernateUserDAO();
		User user = userD.findUserByEmail(userEmail);
		
		return user;
	}

}
