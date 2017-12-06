package org.tarena.dang.test;

import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;

public class TestDeleteUserById {
  public static void main(String[] args) {
	  AdminOperationDAO ao = new AdminOperationDAOImpl();
	  int id = 5;
	  ao.deleteUserById(id);
	  System.out.println("nihao");
}
}
