package org.tarena.dang.action.main;

import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;

public class DeleteSingleUserAction {
  private int id;
  public String execute(){
	  AdminOperationDAO ao = new AdminOperationDAOImpl();
	  ao.deleteUserById(id);
	  return "success";
  }
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
  
}
