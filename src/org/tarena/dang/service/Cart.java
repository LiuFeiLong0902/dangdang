package org.tarena.dang.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.tarena.dang.dao.HibernateProductDAO;
import org.tarena.dang.dao.ProductDAO;
import org.tarena.dang.pojo.Product;

/**
 * ���ﳵ�࣬ʵ������Ʒ����ӡ� ɾ������ա��޸ġ��б��Ƽ������
 */
public class Cart implements CartService {
	// �������û��������Ʒ
	private List<CartItem> items = new ArrayList<CartItem>();
	/**
	 * ������Ʒ
	 */
	public boolean add(int id) {
		// ����id��װһ��Item����
		ProductDAO proDao = new HibernateProductDAO();
		Product pro = proDao.findById(id);
		CartItem item = new CartItem();
		item.setProduct(pro);
		
		
		// �ж��Ƿ����
		for (int i = 0; i < items.size(); i++) {
			CartItem curr = items.get(i);
			if (curr.getProduct().getId() == item.getProduct().getId()) {
				// �Ѿ������
				return false;
			}
		}
		// û�й����
		items.add(item);	
		return true;
	}

	public void delete(int id) {
		// ��itemԪ�ص�buy��������Ϊfalse
		boolean b = false;
		for (int i = 0; i < items.size(); i++) {
			CartItem curr = items.get(i);
			if (curr.getProduct().getId() == id) {
				curr.setBuy(b);
			}
		}
	}

	public void recovery(int id) {
		// ��itemԪ�ص�buy��������Ϊtrue
		for (int i = 0; i < items.size(); i++) {
			CartItem curr = items.get(i);
			if (curr.getProduct().getId() == id) {
				curr.setBuy(true);
			}
		}
	}

	public void clear() {
		// ���ɾ��Ԫ�ص�Item
		items.clear();
	}

	public void modify(int id, int qty) {
		for (int i = 0; i < items.size(); i++) {
			CartItem curr = items.get(i);
			if (curr.getProduct().getId() == id) {
				System.out.println("id�ǣ�" + id + ",qty�ǣ�" + qty);
				if (qty == 0) {
					items.remove(curr);
				} else {
					curr.setQty(qty);
					System.out.println("ֵΪ��" + curr.getQty());
				}
			}
		}
	}

	/**
	 * ��ȡ�����itemԪ��
	 */
	public List<CartItem> getBuyList() {
		List<CartItem> list = new ArrayList<CartItem>();
		// ����buy=true��itemԪ��
		for (CartItem item : items) {
			if (item.isBuy()) {
				list.add(item);
			}
		}
		return list;
	}

	/**
	 * ��ȡɾ����itemԪ��
	 */
	public List<CartItem> getDeleteList() {
		// ����buy=false��itemԪ��		
		List<CartItem> list = new ArrayList<CartItem>();
		// ����buy=true��itemԪ��
		for (CartItem item : items) {
			if (!item.isBuy()) {
				list.add(item);
			}
		}
		return list;
	}

	public double cost() {
		// ͳ��ȷ�Ϲ������Ʒ���
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
		// ͳ�ƹ���ʡ����Ǯ
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
