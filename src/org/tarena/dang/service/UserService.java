package org.tarena.dang.service;

import org.tarena.dang.pojo.User;

public interface UserService {
    public void regist(User user)throws Exception;

	public void findUserById(String email)throws Exception;

	public User findByEmail(String userEmail)throws Exception;
	
	// ����������֤���User����loginAction�е�user
	//public User findUserByEmail(String email)throws Exception;

}
