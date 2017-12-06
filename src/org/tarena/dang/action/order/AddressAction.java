package org.tarena.dang.action.order;

import java.util.List;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.dao.AddressDAO;
import org.tarena.dang.dao.HibernateAddressDAO;
import org.tarena.dang.pojo.Order;
import org.tarena.dang.pojo.Receive_address;
import org.tarena.dang.pojo.User;
import org.tarena.dang.service.CartFactory;
import org.tarena.dang.service.CartItem;
import org.tarena.dang.service.CartService;
import org.tarena.dang.util.Constant;

public class AddressAction extends BaseAction{
	
	private Receive_address receive_address;
    private double cost;
	private Order order;
	
    public String execute(){
        AddressDAO ad = new HibernateAddressDAO();
        User user = (User) session.get(Constant.USER);//��session�л�õ�ǰ��¼���û�id
        CartService cart = CartFactory.getInstance(session);// ͨ���������ù��ﳵ����
        cost = cart.cost();
        List<CartItem> list = cart.getBuyList();//��ø��û����ﳵ�е�������Ʒ
        int userId = user.getId();
        receive_address.setUserId(userId);// �ѵ�ǰ�û���id����receive_address����
        ad.saveOrderAndAddress(receive_address,cost,list);
        
        order=ad.findOrder();
        cart.clear();//��չ��ﳵ       
        return "success";
    }

	public Receive_address getReceive_address() {
		return receive_address;
	}

	public void setReceive_address(Receive_address receive_address) {
		this.receive_address = receive_address;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}




    
}
