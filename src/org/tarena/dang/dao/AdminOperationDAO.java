package org.tarena.dang.dao;

import java.util.List;

import org.tarena.dang.pojo.Book;
import org.tarena.dang.pojo.Order;
import org.tarena.dang.pojo.Product;
import org.tarena.dang.pojo.User;

public interface AdminOperationDAO {
  public List<User> findUsers();//����������ע�ᵱ�������û�

  public List<User> findDeleteUsers();//���ҽ�Ҫ��ɾ�����û�
  
  public void deleteUserById(int id);//����idɾ���û�

  public void updateUserIntegral(int id, int userIntegral);//����id�����û��ĵȼ�
  
  public List<Object[]> findOrders();//�������е��û�����

  public void deleteOrderByEmail(String email);//ɾ������
  
  public List<Book> getAllBook();//����������Ʒ

  public void deleteBookById(int id);//ɾ����Ʒ

  public void addProduct(Product p);//�����Ʒ
}
