package org.tarena.dang.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.tarena.dang.dao.HibernateProductDAO;
import org.tarena.dang.dao.ProductDAO;
import org.tarena.dang.pojo.Product;

public class TestProductOrder {
  public static void main(String[] args) {
	ProductDAO pd = new HibernateProductDAO();
	List<Product> lists = new ArrayList<Product>();
	lists = pd.findProductOrderByPrice(3,1,6);
	Iterator ite = lists.iterator();
	while(ite.hasNext()){
		Product pro = (Product) ite.next();
		System.out.println(pro.getProductName());
	}
  }
}
