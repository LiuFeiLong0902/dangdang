package org.tarena.dang.action.main;

import org.tarena.dang.action.BaseAction;

import com.opensymphony.xwork2.Action;

public class ManagerLoginAction extends BaseAction{
  //input	
  private String managername;
  private String password;
  public String execute(){
	  if(managername.equals("admin") && password.equals("admin")){
		  session.put("admin",managername);
		  return Action.SUCCESS;		  
	  }else{
		  return Action.ERROR;
	  }
  }
  public String getManagername() {
	return managername;
  }
  public void setManagername(String managername) {
	this.managername = managername;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
	this.password = password;
  }
  
}
