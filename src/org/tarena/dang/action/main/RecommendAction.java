package org.tarena.dang.action.main;


import java.util.List;
import org.tarena.dang.dao.HibernateProductDAO;
import org.tarena.dang.dao.ProductDAO;
import org.tarena.dang.pojo.Book;


public class RecommendAction {
    //private List<Product> pros;
    private List<Book> books;
    
    
    public String execute(){
    	
    	ProductDAO proDao = new HibernateProductDAO();
		books = proDao.findRecommandBook();
		System.out.println(books.size());
	   
		return "success";
    }
    
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
    
}
