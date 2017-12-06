package org.tarena.dang.action.main;

import java.util.List;

import org.tarena.dang.dao.HibernateProductDAO;
import org.tarena.dang.dao.ProductDAO;
import org.tarena.dang.pojo.Product;

/**
 * ��ʾ�����ϼ�ͼ��
 * @author Administrator
 *
 */
public class NewsAction {
    //input������Ĭ��Ϊ8
	private int size = 8;
	//output
	private List<Product> pros;
	
	public String execute() throws Exception{
		// Thread.sleep(1000);
		ProductDAO proDao = new HibernateProductDAO();
		pros = proDao.findTopProduct(size);
		return "success";
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<Product> getPros() {
		return pros;
	}
	public void setPros(List<Product> pros) {
		this.pros = pros;
	}
	
}
