package org.tarena.dang.dao;

import java.util.List;

import org.tarena.dang.pojo.Order;
import org.tarena.dang.pojo.Receive_address;
import org.tarena.dang.service.CartItem;

public interface AddressDAO {
    public void saveOrderAndAddress(Receive_address ra, double cost, List<CartItem> list);

	public Order findOrder();

	public List<Receive_address> findReceiveAddressByUserId(int userId);

	public Receive_address findReceiveAddressById(int id);
}