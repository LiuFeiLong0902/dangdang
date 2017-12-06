package org.tarena.dang.test;

import org.junit.Test;
import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;
import org.tarena.dang.pojo.Product;

public class TestSaveProduct {
 
  public static void main(String[] args){
	  AdminOperationDAO ad = new AdminOperationDAOImpl();
	  Product p = new Product();
	  p.setDangPrice(1200);
	  p.setDescription("good");
	  p.setProductName("∫√ È");
	  p.setFixedPrice(2000);
	  p.setHasDeleted(0);
	  ad.addProduct(p);
	  System.out.println("o");
  }
}
