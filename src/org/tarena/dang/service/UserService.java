package org.tarena.dang.service;

import org.tarena.dang.pojo.User;

public interface UserService {
    public void regist(User user)throws Exception;

	public void findUserById(String email)throws Exception;

	public User findByEmail(String userEmail)throws Exception;
	
	// 带有邮箱验证码的User传给loginAction中的user
	//public User findUserByEmail(String email)throws Exception;

}
