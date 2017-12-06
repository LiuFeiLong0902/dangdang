package org.tarena.dang.action.main;

import java.util.List;

import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;
import org.tarena.dang.pojo.User;

import com.opensymphony.xwork2.Action;

public class UpdateUserIntegralAction {
	  private List<User> users;
	  public String execute(){
		  AdminOperationDAO ao = new AdminOperationDAOImpl();
		  users = ao.findUsers();
		  return Action.SUCCESS;
	  }
	  public List<User> getUsers() {
		return users;
	  }
	  public void setUsers(List<User> users) {
		this.users = users;
	  }
}
