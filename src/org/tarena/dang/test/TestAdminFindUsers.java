package org.tarena.dang.test;

import java.util.ArrayList;
import java.util.List;

import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;
import org.tarena.dang.pojo.User;

public class TestAdminFindUsers {
  public static void main(String[] args) {
	  AdminOperationDAO ao = new AdminOperationDAOImpl();
	  List<User> users = new ArrayList<User>();
	  users = ao.findUsers();
	  System.out.println(users.size());
}
}
