package org.tarena.dang.dao;

import org.tarena.dang.pojo.User;

public interface UserDAO {
	public void save(User user) throws Exception;// �����û�

	public User findByEmail(String email) throws Exception;// ��֤�����Ƿ�ռ��

	public void findUserById(String email) throws Exception;// ����email�����û����жϸ��û��Ƿ���������֤

	public User findUserByEmail(String userEmail) throws Exception;//����email���Ҹ��û�

    public void modifyUser(User user)throws Exception;//�޸��û��ĸ�����Ϣ
}
