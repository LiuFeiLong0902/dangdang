package org.tarena.dang.action.user;

import org.tarena.dang.dao.HibernateUserDAO;
import org.tarena.dang.dao.UserDAO;
import org.tarena.dang.pojo.User;
/**
 * 验证邮箱是否被占用
 * @author Administrator
 *
 */
public class ValidEmailAction {
    //input
	 private String email;
	//output
	 private boolean ok = false;//如果等于true，代表可用，false，不可用，以json返回。
	 
	 
	 public String execute() throws Exception{
		 UserDAO userDao = new HibernateUserDAO();
		 User user = userDao.findByEmail(email);
		 if(user==null){
			 ok=true;
		 }else{
			 ok=false;
		 }
		 return "success";//以json方式将ok返回
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
