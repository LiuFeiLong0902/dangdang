package org.tarena.dang.action.order;

import java.util.List;
import org.tarena.dang.action.BaseAction;
import org.tarena.dang.dao.AddressDAO;
import org.tarena.dang.dao.HibernateAddressDAO;
import org.tarena.dang.pojo.Receive_address;
import org.tarena.dang.pojo.User;
import org.tarena.dang.util.Constant;

public class OrderSubAction extends BaseAction {

	private List<Receive_address> receive_add;

	public String execute() {
		User user = (User) session.get(Constant.USER);// 从session中获得当前登录的用户id
		int userId = user.getId();
		AddressDAO ad = new HibernateAddressDAO();
		receive_add = ad.findReceiveAddressByUserId(userId);
   
   
		return "success";
	}

	public List<Receive_address> getReceive_add() {
		return receive_add;
	}

	public void setReceive_add(List<Receive_address> receive_add) {
		this.receive_add = receive_add;
	}

}
