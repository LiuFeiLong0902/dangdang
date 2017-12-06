package org.tarena.dang.action.main;

import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;

public class UpdateSingleUserIntegralAction {
  private int id;
  private int integral;
  public String execute(){
	  AdminOperationDAO ao = new AdminOperationDAOImpl();
	  System.out.println(id+","+integral);
	  ao.updateUserIntegral(id,integral);
	  return "success";
  }
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
  public int getIntegral() {
	return integral;
  }
  public void setIntegral(int integral) {
	this.integral = integral;
  }

 
  
}
