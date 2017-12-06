package org.tarena.dang.action.cart;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.service.CartFactory;
import org.tarena.dang.service.CartService;

public class BuyAction extends BaseAction{
    //input
	private int id;// 要购买产品的id
	//output
	private boolean ok= false;//以json对象返回购买结果
	
	public String execute(){
	    CartService cart = CartFactory.getInstance(session);
	    //调用cart购买处理
	    ok=cart.add(id);
	    return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}
	
}
