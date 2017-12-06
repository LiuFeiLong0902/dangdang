package org.tarena.dang.dao;

import java.util.List;

import org.tarena.dang.pojo.Book;
import org.tarena.dang.pojo.Order;
import org.tarena.dang.pojo.Product;
import org.tarena.dang.pojo.User;

public interface AdminOperationDAO {
  public List<User> findUsers();//查找所有已注册当当网的用户

  public List<User> findDeleteUsers();//查找将要被删除的用户
  
  public void deleteUserById(int id);//根据id删除用户

  public void updateUserIntegral(int id, int userIntegral);//根据id更新用户的等级
  
  public List<Object[]> findOrders();//查找所有的用户订单

  public void deleteOrderByEmail(String email);//删除订单
  
  public List<Book> getAllBook();//查找所有商品

  public void deleteBookById(int id);//删除商品

  public void addProduct(Product p);//添加商品
}
