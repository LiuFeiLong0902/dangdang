package org.tarena.dang.action.main;

import java.util.List;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.dao.HibernateProductDAO;
import org.tarena.dang.dao.ProductDAO;
import org.tarena.dang.pojo.Product;

public class HotAction extends BaseAction{
    
	private int size = 8;//size设置为8，从item表中取销量最多的8个记录
	private List<Product> products;
	public String execute(){
		ProductDAO p = new HibernateProductDAO();
		products = p.findHotProduct(size);	
		return "success";
    }
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
