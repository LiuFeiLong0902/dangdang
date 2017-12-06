package org.tarena.dang.action.user;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.dao.HibernateUserDAO;
import org.tarena.dang.dao.UserDAO;
import org.tarena.dang.pojo.User;
import org.tarena.dang.util.MD5Util;

public class MddModifyAction extends BaseAction{
  //input
  private String nickname;
  private String password;
  private User user;
  //output
  
  public String execute() throws Exception{
	  user = (User) session.get("user");
	  user.setNickname(nickname);
	  user.setPassword(MD5Util.degist(password));
	  UserDAO userDao = new HibernateUserDAO();
	  userDao.modifyUser(user);
	  return "success";
  }
  public String getNickname() {
	return nickname;
  }
  public void setNickname(String nickname) {
	this.nickname = nickname;
  }
  public String getPassword() {
	return password;
  }
  public void setPassword(String password) {
	this.password = password;
  }
  public User getUser() {
	return user;
  }
  public void setUser(User user) {
	this.user = user;
}
  
}
