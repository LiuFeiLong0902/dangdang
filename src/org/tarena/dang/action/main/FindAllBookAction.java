package org.tarena.dang.action.main;

import java.util.List;

import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;
import org.tarena.dang.pojo.Book;

public class FindAllBookAction {
  private List<Book> books;
  public String execute(){
	  AdminOperationDAO ad = new AdminOperationDAOImpl();
	  books = ad.getAllBook();
	  return "success";
  }
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
  
}
