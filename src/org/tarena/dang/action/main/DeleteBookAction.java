package org.tarena.dang.action.main;

import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;

public class DeleteBookAction {
  private int id;
  public String execute(){
	  AdminOperationDAO ad = new AdminOperationDAOImpl();
	  ad.deleteBookById(id);
	  return "success";
  }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
  
}
