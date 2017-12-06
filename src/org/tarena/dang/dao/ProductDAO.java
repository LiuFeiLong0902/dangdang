package org.tarena.dang.dao;

import java.util.List;

import org.tarena.dang.pojo.Book;
import org.tarena.dang.pojo.Product;

public interface ProductDAO {
     public List<Product> findTopProduct(int size);//从表Product中取热销的产品，size为指定数量    
     public List<Book> findRecommandBook();//从表Book中取几个推荐产品
     public List<Product> findProductByCatId(int cid,int page,int pageSize);// 分页查找
     public List<Product> findHotProduct(int size);// 查找热销产品
     public Product findById(int id);// 依据id找到对应的该商品
     public Object[] findProductDetailById(int id);//根据id找到商品的所有详细信息
	 public List<Product> findProductOrderByPrice(int cid, int page, int pageSize);//根据价格商品排序，降序
	 public List<Product> findProductOrderByPriceAsc(int cid, int page,int pageSize);//根据价格，商品进行排序，升序排列
	 public List<Product> findProdouctOrderByTimeAsc(int cid, int page,int pageSize);//按上货时间进行排序，升序
	 public List<Product> findProdouctOrderByTime(int cid, int page, int pageSize);//按上货时间进行排序，降序
}
