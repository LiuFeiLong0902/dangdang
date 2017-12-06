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
     * ������û��ķ�����ַ�Ͷ���
     */
	public void saveOrderAndAddress(Receive_address ra,double cost,List<CartItem> list) {
		
		getSession().saveOrUpdate(ra);//�����û��ķ�����ַ��d_receive_address����
		
	    order = new Order();
		order.setReceiveName(ra.getReceiveName());// order����ֵΪ�ջ��˵�����
		order.setFullAddress(ra.getFullAddress());// order����ֵΪ������ַ
		order.setPostalCode(ra.getPostalCode());// order����ֵΪ��������
		order.setPhone(ra.getPhone());// order����ֵΪ�绰����
		order.setMobile(ra.getMobile());// order����ֵΪ�ֻ�
		order.setUserId(ra.getUserId());// order����ֵΪ��ǰ��¼�û���id
		order.setOrderDesc("����ֵ��һ��");//
		order.setOrderTime(System.currentTimeMillis());
		order.setStatus(Constant.WAIT_PAY);
		order.setTotalPrice(cost);
		
		getSession().saveOrUpdate(order);//���浱ǰ�û��Ķ�����d_order����
		
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
 * �����û���id�����ұ�d_receive-address��Ȼ�󷵻�һ��List<Receive_address>����
 */ 
	public List<Receive_address> findReceiveAddressByUserId(int userId) {
		Query query = getSession().createQuery("from Receive_address where userId=?");
		query.setInteger(0,userId);
		
		return query.list();
		
	}
/**
 * ��ַ����
 */
   public Receive_address findReceiveAddressById(int id) {
	   Receive_address ra = new Receive_address();
	   Query query = getSession().createQuery("from Receive_address where id=?");
	   query.setInteger(0,id);
	   ra = (Receive_address) query.uniqueResult(); 
	return ra;
}

}
