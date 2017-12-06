package org.tarena.dang.action.main;

import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;
import org.tarena.dang.pojo.Product;

public class AddProductAction {
  private String name;
  private String description;
  private String fixedprice;
  private String dangprice;
  
  public String execute(){
	  AdminOperationDAO ad = new AdminOperationDAOImpl();
	  Product p = new Product();
	  p.setProductName(name);
	  p.setFixedPrice(Double.parseDouble(fixedprice));
	  p.setDangPrice(Double.parseDouble(dangprice));
	  p.setDescription(description);
	  p.setHasDeleted(0);
	  p.setProductPic("15.jpg");
	  ad.addProduct(p);
	  System.out.println("action");
	  return "ok";
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getFixedprice() {
	return fixedprice;
}

public void setFixedprice(String fixedprice) {
	this.fixedprice = fixedprice;
}

public String getDangprice() {
	return dangprice;
}

public void setDangprice(String dangprice) {
	this.dangprice = dangprice;
}
  
}
