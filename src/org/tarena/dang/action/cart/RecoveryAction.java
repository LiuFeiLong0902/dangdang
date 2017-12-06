package org.tarena.dang.action.cart;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.service.CartFactory;
import org.tarena.dang.service.CartService;

public class RecoveryAction extends BaseAction{
    private int id;
    public String execute(){
    	 CartService cart = CartFactory.getInstance(session);
    	 cart.recovery(id);
    	 return "success";
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
}
