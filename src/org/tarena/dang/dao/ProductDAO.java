package org.tarena.dang.dao;

import java.util.List;

import org.tarena.dang.pojo.Book;
import org.tarena.dang.pojo.Product;

public interface ProductDAO {
     public List<Product> findTopProduct(int size);//�ӱ�Product��ȡ�����Ĳ�Ʒ��sizeΪָ������    
     public List<Book> findRecommandBook();//�ӱ�Book��ȡ�����Ƽ���Ʒ
     public List<Product> findProductByCatId(int cid,int page,int pageSize);// ��ҳ����
     public List<Product> findHotProduct(int size);// ����������Ʒ
     public Product findById(int id);// ����id�ҵ���Ӧ�ĸ���Ʒ
     public Object[] findProductDetailById(int id);//����id�ҵ���Ʒ��������ϸ��Ϣ
	 public List<Product> findProductOrderByPrice(int cid, int page, int pageSize);//���ݼ۸���Ʒ���򣬽���
	 public List<Product> findProductOrderByPriceAsc(int cid, int page,int pageSize);//���ݼ۸���Ʒ����������������
	 public List<Product> findProdouctOrderByTimeAsc(int cid, int page,int pageSize);//���ϻ�ʱ�������������
	 public List<Product> findProdouctOrderByTime(int cid, int page, int pageSize);//���ϻ�ʱ��������򣬽���
}
