package org.tarena.dang.action.cart;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.service.CartFactory;
import org.tarena.dang.service.CartService;

public class ClearAction extends BaseAction{
	
	public String execute(){
   	 CartService cart = CartFactory.getInstance(session);
   	 cart.clear();
   	 return "success";
   }
	
}
