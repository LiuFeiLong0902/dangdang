package org.tarena.dang.action.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;
import org.tarena.dang.pojo.LiuEntity;

public class ShowOrderAction {
  private List<LiuEntity> orders;
  private String email;
  public String execute(){
	  AdminOperationDAO ad = new AdminOperationDAOImpl();
	  List<Object[]> all = new ArrayList<Object[]>();
	  all = ad.findOrders();
	  Iterator it = all.iterator();
	  orders = new ArrayList<LiuEntity>();
	  while(it.hasNext()){
		  Object[] obj = (Object[]) it.next();
		  Date date = new Date(Long.parseLong(obj[0].toString()));
		  String time = date.toLocaleString();
		  LiuEntity liu = new LiuEntity();
		  liu.setTime(time);
		  liu.setEmail((String) obj[1]);
		  liu.setNickname((String)obj[2]);
		  liu.setLevel((Integer)obj[3]);
		  liu.setTotalPrice((Double)obj[4]);
		  liu.setRecename((String)obj[5]);
		  liu.setAllrece((String)obj[6]);
		  liu.setCode((String)obj[7]);
		  liu.setMobile((String)obj[8]);
		  orders.add(liu);
	  }
	  return "success";
  }
  public String destoryByEmail(){
	  AdminOperationDAO ad = new AdminOperationDAOImpl();
	  ad.deleteOrderByEmail(email);
	  return "destorySucc";
  }
public List<LiuEntity> getOrders() {
	return orders;
}
public void setOrders(List<LiuEntity> orders) {
	this.orders = orders;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  
  
}
