package org.tarena.dang.action.cart;

import java.util.List;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.service.CartFactory;
import org.tarena.dang.service.CartItem;
import org.tarena.dang.service.CartService;

public class CartListAction extends BaseAction{
	//input无
	//output
	private List<CartItem> buyList;
	private List<CartItem> delList;
	private double totalPrice;
	private double salePrice;
	
	
	public String execute(){
		//获取要输出显示的数据
		CartService cart = 
			CartFactory.getInstance(session);
		buyList = cart.getBuyList();
		delList = cart.getDeleteList();
		totalPrice = cart.cost();
		salePrice = cart.sale();
		return "success";
	}
	
	public List<CartItem> getBuyList() {
		return buyList;
	}


	public void setBuyList(List<CartItem> buyList) {
		this.buyList = buyList;
	}


	public List<CartItem> getDelList() {
		return delList;
	}


	public void setDelList(List<CartItem> delList) {
		this.delList = delList;
	}


	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
