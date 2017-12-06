package org.tarena.dang.action.order;

import java.util.List;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.service.CartFactory;
import org.tarena.dang.service.CartItem;
import org.tarena.dang.service.CartService;

public class OrderAction extends BaseAction {
	// input��
	// output
	private List<CartItem> buyList;// ���湺�����Ʒ��Ŀ
	private double totalPrice;// ������Ʒ���ܼ�
	
	public String execute() {
		// ��ȡҪ�����ʾ������
		CartService cart = CartFactory.getInstance(session);// ͨ���������ù��ﳵ����
		buyList = cart.getBuyList();
		totalPrice = cart.cost();
		System.out.println("�ܼ۸�Ϊ��"+totalPrice);
		if(totalPrice==0){
			return "main";
		}
		return "success";
	}

	public List<CartItem> getBuyList() {
		return buyList;
	}

	public void setBuyList(List<CartItem> buyList) {
		this.buyList = buyList;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
