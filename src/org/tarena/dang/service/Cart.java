package org.tarena.dang.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.tarena.dang.dao.HibernateProductDAO;
import org.tarena.dang.dao.ProductDAO;
import org.tarena.dang.pojo.Product;

/**
 * 购物车类，实现了商品的添加、 删除、清空、修改、列表、计价六项功能
 */
public class Cart implements CartService {
	// 保存了用户购买的商品
	private List<CartItem> items = new ArrayList<CartItem>();
	/**
	 * 购买商品
	 */
	public boolean add(int id) {
		// 利用id封装一个Item对象
		ProductDAO proDao = new HibernateProductDAO();
		Product pro = proDao.findById(id);
		CartItem item = new CartItem();
		item.setProduct(pro);
		
		
		// 判断是否购买过
		for (int i = 0; i < items.size(); i++) {
			CartItem curr = items.get(i);
			if (curr.getProduct().getId() == item.getProduct().getId()) {
				// 已经购买过
				return false;
			}
		}
		// 没有购买过
		items.add(item);	
		return true;
	}

	public void delete(int id) {
		// 将item元素的buy属性设置为false
		boolean b = false;
		for (int i = 0; i < items.size(); i++) {
			CartItem curr = items.get(i);
			if (curr.getProduct().getId() == id) {
				curr.setBuy(b);
			}
		}
	}

	public void recovery(int id) {
		// 将item元素的buy属性设置为true
		for (int i = 0; i < items.size(); i++) {
			CartItem curr = items.get(i);
			if (curr.getProduct().getId() == id) {
				curr.setBuy(true);
			}
		}
	}

	public void clear() {
		// 清除删除元素的Item
		items.clear();
	}

	public void modify(int id, int qty) {
		for (int i = 0; i < items.size(); i++) {
			CartItem curr = items.get(i);
			if (curr.getProduct().getId() == id) {
				System.out.println("id是：" + id + ",qty是：" + qty);
				if (qty == 0) {
					items.remove(curr);
				} else {
					curr.setQty(qty);
					System.out.println("值为：" + curr.getQty());
				}
			}
		}
	}

	/**
	 * 获取购买的item元素
	 */
	public List<CartItem> getBuyList() {
		List<CartItem> list = new ArrayList<CartItem>();
		// 返回buy=true的item元素
		for (CartItem item : items) {
			if (item.isBuy()) {
				list.add(item);
			}
		}
		return list;
	}

	/**
	 * 获取删除的item元素
	 */
	public List<CartItem> getDeleteList() {
		// 返回buy=false的item元素		
		List<CartItem> list = new ArrayList<CartItem>();
		// 返回buy=true的item元素
		for (CartItem item : items) {
			if (!item.isBuy()) {
				list.add(item);
			}
		}
		return list;
	}

	public double cost() {
		// 统计确认购买的商品金额
		int total = 0;
		for (int i = 0; i < items.size(); i++) {
			CartItem curr = items.get(i);
			if(curr.isBuy()){
			total += curr.getProduct().getDangPrice() * curr.getQty();
			}
		}
		return total;
	}
    
	public double sale() {
		// 统计共节省多少钱
		int sale = 0;
		for (int i = 0; i < items.size(); i++) {
			CartItem curr = items.get(i);
			if(curr.isBuy()){
			sale += (curr.getProduct().getFixedPrice() - curr.getProduct()
					.getDangPrice())
					* curr.getQty();
			}
		}
		return sale;
	}

}
