package org.tarena.dang.action.cart;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.service.CartFactory;
import org.tarena.dang.service.CartService;

public class BuyAction extends BaseAction{
    //input
	private int id;// Ҫ�����Ʒ��id
	//output
	private boolean ok= false;//��json���󷵻ع�����
	
	public String execute(){
	    CartService cart = CartFactory.getInstance(session);
	    //����cart������
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
