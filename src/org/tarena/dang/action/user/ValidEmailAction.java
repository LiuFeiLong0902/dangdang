package org.tarena.dang.action.user;

import org.tarena.dang.dao.HibernateUserDAO;
import org.tarena.dang.dao.UserDAO;
import org.tarena.dang.pojo.User;
/**
 * ��֤�����Ƿ�ռ��
 * @author Administrator
 *
 */
public class ValidEmailAction {
    //input
	 private String email;
	//output
	 private boolean ok = false;//�������true��������ã�false�������ã���json���ء�
	 
	 
	 public String execute() throws Exception{
		 UserDAO userDao = new HibernateUserDAO();
		 User user = userDao.findByEmail(email);
		 if(user==null){
			 ok=true;
		 }else{
			 ok=false;
		 }
		 return "success";//��json��ʽ��ok����
	 }
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	 
}
