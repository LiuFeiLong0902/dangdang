package org.tarena.dang.action.main;

import org.tarena.dang.pojo.Book;
import org.tarena.dang.pojo.Product;
import org.tarena.dang.service.ProductDetailService;
import org.tarena.dang.service.ProductDetailServiceImpl;

public class BookDetailAction {
  private int id;	
  private Product product;
  private Book book;
  //Category ‰≥ˆ–≈œ¢
  
  public String execute(){
	  System.out.println("hello"+id);
	  ProductDetailService pds = new ProductDetailServiceImpl();
	  Object[] obj = pds.findProductAndBookDetail(id);
	  product=(Product) obj[0];
	  book=(Book) obj[1];
	  System.out.println(book.getAuthor());
	  return "success";
  }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
  
}
