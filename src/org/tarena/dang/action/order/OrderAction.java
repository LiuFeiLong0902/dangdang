package org.tarena.dang.action.order;

import java.util.List;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.service.CartFactory;
import org.tarena.dang.service.CartItem;
import org.tarena.dang.service.CartService;

public class OrderAction extends BaseAction {
	// input无
	// output
	private List<CartItem> buyList;// 保存购买的商品条目
	private double totalPrice;// 购买商品的总价
	
	public String execute() {
		// 获取要输出显示的数据
		CartService cart = CartFactory.getInstance(session);// 通过工厂类获得购物车对象
		buyList = cart.getBuyList();
		totalPrice = cart.cost();
		System.out.println("总价格为："+totalPrice);
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
