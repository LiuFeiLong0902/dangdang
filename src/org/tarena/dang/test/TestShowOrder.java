package org.tarena.dang.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.tarena.dang.dao.AdminOperationDAO;
import org.tarena.dang.dao.AdminOperationDAOImpl;
import org.tarena.dang.pojo.LiuEntity;
import org.tarena.dang.pojo.Order;

public class TestShowOrder {
   public static void main(String[] args) {
	AdminOperationDAO ad = new AdminOperationDAOImpl();
	/*List<Object[]> all = new ArrayList<Object[]>();
	all = ad.findOrders();
	List<Order> lists = new ArrayList<Order>();	
	List<LiuEntity> orders  = new ArrayList<LiuEntity>();	
	Iterator it = all.iterator();
	//System.out.println(all.size());
	while(it.hasNext()){
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
			  System.out.println(liu.getAllrece()+","+liu.getTime());
			  orders.add(liu);
		  }
		System.out.println(orders.size());
        
	}*/
	ad.deleteOrderByEmail("dandi@qq.com");
	System.out.println("o");
}
}
