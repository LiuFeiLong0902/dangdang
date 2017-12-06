package org.tarena.dang.dao;

import java.util.List;

import org.hibernate.Query;
import org.tarena.dang.pojo.Book;
import org.tarena.dang.pojo.Order;
import org.tarena.dang.pojo.Product;
import org.tarena.dang.pojo.User;

public class AdminOperationDAOImpl extends BaseDAO implements AdminOperationDAO{
    //查找所有已注册的用户
	public List<User> findUsers() {
		String hql="from User";
		Query query = getSession().createQuery(hql);
		
		return query.list();
	}
    //查找将被删除的用户
	public List<User> findDeleteUsers() {
		String hql="from User";
		Query query = getSession().createQuery(hql);
		
		return query.list();
	}
    //根据id删除用户
	public void deleteUserById(int id){
		String hql = "delete User where id=?";
		Query query = getSession().createQuery(hql);
		query.setInteger(0,id);
		query.executeUpdate();
	}
	public void updateUserIntegral(int id, int userIntegral) {
		String hql = "update User set userIntegral=? where id=?";
		Query query = getSession().createQuery(hql);
		query.setInteger(0,userIntegral);
		query.setInteger(1,id);
		query.executeUpdate();
		System.out.println("id:"+id+",userIntegral:"+userIntegral);
	}
	@SuppressWarnings("unchecked")
	public List<Object[]> findOrders() {
		String sql = "select do.order_time,du.email,du.nickname,du.user_integral,do.total_price,do.receive_name,do.full_address,do.postal_code,do.mobile from d_order do join d_user du on(do.user_id = du.id)";
		//Query query = getSession().createSQLQuery(sql).addEntity(Order.class);
		Query query  = getSession().createSQLQuery(sql);
		return query.list();
	}
	public void deleteOrderByEmail(String email) {
		String sql = "delete from d_order where user_id in (select id from d_user where email=?)";
		Query query = getSession().createSQLQuery(sql);
		query.setString(0,email);
		query.executeUpdate();
	}
	public List<Book> getAllBook(){
		String sql = "select * from d_product dp join d_book db on dp.id=db.id and dp.has_deleted=0";
		Query query = getSession().createSQLQuery(sql).addEntity(Book.class);
		return query.list();
	}
	public void deleteBookById(int id) {
		System.out.println("dao");
		String hql = "update Product set hasDeleted=1 where id=?";
		Query query = getSession().createQuery(hql);
		query.setInteger(0,id);
		query.executeUpdate();
		System.out.println("over"+id);
		
	}
	public void addProduct(Product p) {
		getSession().beginTransaction().begin();
		getSession().save(p);
		getSession().beginTransaction().commit();
		
	}
}
