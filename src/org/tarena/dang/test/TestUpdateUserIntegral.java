package org.tarena.dang.test;

import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;

public class TestUpdateUserIntegral {
   public static void main(String[] args) {
	 AdminOperationDAO ad = new AdminOperationDAOImpl();
	 ad.updateUserIntegral(1, 2);
}
}
