package org.tarena.dang.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.tarena.dang.pojo.Item;
import org.tarena.dang.pojo.Order;
import org.tarena.dang.pojo.Receive_address;
import org.tarena.dang.service.CartItem;
import org.tarena.dang.util.Constant;

public class HibernateAddressDAO extends BaseDAO implements AddressDAO {
	private Order order;
    /**
     * 保存该用户的发货地址和订单
     */
	public void saveOrderAndAddress(Receive_address ra,double cost,List<CartItem> list) {
		
		getSession().saveOrUpdate(ra);//保存用户的发货地址到d_receive_address表中
		
	    order = new Order();
		order.setReceiveName(ra.getReceiveName());// order对象赋值为收货人的姓名
		order.setFullAddress(ra.getFullAddress());// order对象赋值为发货地址
		order.setPostalCode(ra.getPostalCode());// order对象赋值为邮政编码
		order.setPhone(ra.getPhone());// order对象赋值为电话号码
		order.setMobile(ra.getMobile());// order对象赋值为手机
		order.setUserId(ra.getUserId());// order对象赋值为当前登录用户的id
		order.setOrderDesc("该书值的一看");//
		order.setOrderTime(System.currentTimeMillis());
		order.setStatus(Constant.WAIT_PAY);
		order.setTotalPrice(cost);
		
		getSession().saveOrUpdate(order);//保存当前用户的订单到d_order表中
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			CartItem ci = (CartItem) iterator.next();
			Item item = new Item();
			item.setOrderId(order.getId());
			item.setProduct(ci.getProduct());
			item.setDangPrice(ci.getProduct().getDangPrice());
			item.setProductName(ci.getProduct().getProductName());
			item.setProductNum(ci.getQty());
			item.setAmount(ci.getProduct().getDangPrice()*ci.getQty());
			getSession().saveOrUpdate(item);
		}
	}

	public Order findOrder() {			
		return order;
	}
/**
 * 根据用户的id，查找表d_receive-address，然后返回一个List<Receive_address>集合
 */ 
	public List<Receive_address> findReceiveAddressByUserId(int userId) {
		Query query = getSession().createQuery("from Receive_address where userId=?");
		query.setInteger(0,userId);
		
		return query.list();
		
	}
/**
 * 地址回显
 */
   public Receive_address findReceiveAddressById(int id) {
	   Receive_address ra = new Receive_address();
	   Query query = getSession().createQuery("from Receive_address where id=?");
	   query.setInteger(0,id);
	   ra = (Receive_address) query.uniqueResult(); 
	return ra;
}

}
