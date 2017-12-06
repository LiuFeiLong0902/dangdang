package org.tarena.dang.action.cart;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.service.CartFactory;
import org.tarena.dang.service.CartService;

public class DelAction extends BaseAction{
	private int id;
	
    public String execute(){
    	 CartService cart = CartFactory.getInstance(session);
    	 cart.delete(id);
    	 return "success";
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
}
