package org.tarena.dang.action.order;

import java.util.List;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.dao.AddressDAO;
import org.tarena.dang.dao.HibernateAddressDAO;
import org.tarena.dang.pojo.Receive_address;

public class GetAddressAction extends BaseAction{
	private Receive_address receive_add; 
	private int id;//用户的发货地址的id
	
	public String execute(){
		AddressDAO ad = new HibernateAddressDAO();
		receive_add = ad.findReceiveAddressById(id); 
		
		return "success";
    }

	public Receive_address getReceive_add() {
		return receive_add;
	}

	public void setReceive_add(Receive_address receive_add) {
		this.receive_add = receive_add;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
