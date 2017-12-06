package org.tarena.dang.service;

import org.tarena.dang.action.main.BookDetailAction;
import org.tarena.dang.dao.HibernateProductDAO;
import org.tarena.dang.dao.ProductDAO;
import org.tarena.dang.pojo.Book;
import org.tarena.dang.pojo.Product;

public class ProductDetailServiceImpl implements ProductDetailService{

	public Object[] findProductAndBookDetail(int id){
		ProductDAO proDao = new HibernateProductDAO();
		Product pro = new Product();
		Book book = new Book();
		Object[] objs = proDao.findProductDetailById(id);
		System.out.println("éL¶Èžé£º"+objs.length);
			pro.setId(id);
			pro.setProductName((String)objs[1]);
			pro.setFixedPrice((Double)objs[2]);
			pro.setDangPrice((Double)objs[3]);
			pro.setDescription((String) objs[4]);
			pro.setProductPic((String) objs[5]);
			book.setAuthor((String) objs[6]);
			book.setPublishing((String) objs[7]);
			book.setWordNumber((String) objs[8]);
			book.setWhichEdtion((String) objs[9]);
			book.setTotalPage((String) objs[10]);
			book.setIsbn((String) objs[11]);
			book.setAuthorSummary((String) objs[12]);
			book.setCatalogue((String) objs[13]);
		Object[] obj={pro,book};	
		return obj;
	}

}
