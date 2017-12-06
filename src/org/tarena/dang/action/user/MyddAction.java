package org.tarena.dang.action.user;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.pojo.User;
/*
 * 我的当当
 */
public class MyddAction extends BaseAction{
  private User user;
  public String execute(){
	  user = (User) session.get("user");
	  System.out.println(user.getEmail());
	  return "success";
  }
  public User getUser() {
	 return user;
  }
  public void setUser(User user) {
	this.user = user;
  }
  
}
