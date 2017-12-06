package org.tarena.dang.test;

import java.util.ArrayList;
import java.util.List;

import org.tarena.dang.dao.HibernateProductDAO;
import org.tarena.dang.dao.ProductDAO;
import org.tarena.dang.pojo.Book;
import org.tarena.dang.pojo.Product;
import org.tarena.dang.service.ProductDetailService;
import org.tarena.dang.service.ProductDetailServiceImpl;

public class TestProduct {
  public static void main(String[] args) {
//	  ProductDAO proDao = new HibernateProductDAO();
//	  Product pro = new Product();
//	  
//	 Object[] objs = proDao.findProductDetailById(2);
//     System.out.println(objs[0]+","+objs[5]);
     ProductDetailService pds = new ProductDetailServiceImpl();
	  Object[] obj = pds.findProductAndBookDetail(2);
	  Product product=(Product) obj[0];
	  Book book=(Book) obj[1];
	  System.out.println(product.getProductName()+","+book.getAuthor());
	  
}
}
