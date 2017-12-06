package org.tarena.dang.dao;

import org.tarena.dang.pojo.User;

public interface UserDAO {
	public void save(User user) throws Exception;// 保存用户

	public User findByEmail(String email) throws Exception;// 验证邮箱是否被占用

	public void findUserById(String email) throws Exception;// 根据email查找用户，判断该用户是否邮箱已验证

	public User findUserByEmail(String userEmail) throws Exception;//根据email查找该用户

    public void modifyUser(User user)throws Exception;//修改用户的个人信息
}
