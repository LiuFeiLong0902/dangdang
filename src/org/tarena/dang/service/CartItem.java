package org.tarena.dang.service;

import org.tarena.dang.pojo.Product;

/**
 * ��Ʒ��Ŀ��
 * ���ݹ��ﳵ�б�һ�м�¼��д
 */
public class CartItem {
	private Product product;
	private int qty = 1;
	private boolean buy = true;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public boolean isBuy() {
		return buy;
	}
	public void setBuy(boolean buy) {
		this.buy = buy;
	}
	
	
}
