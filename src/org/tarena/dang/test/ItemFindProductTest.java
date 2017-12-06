package org.tarena.dang.test;

import org.hibernate.Session;
import org.junit.Test;
import org.tarena.dang.pojo.Item;
import org.tarena.dang.util.HibernateUtil;


public class ItemFindProductTest {
    @Test
    public void test1(){
    	Session session = HibernateUtil.getSession();
    	Item item = (Item) session.load(Item.class,2);
    	System.out.println(item.getId());
		System.out.println(item.getOrderId());
		System.out.println(item.getProduct().getId());
		System.out.println(item.getProduct().getFixedPrice());
		System.out.println(item.getProduct().getDangPrice());
		System.out.println(item.getProduct().getProductPic());
		HibernateUtil.closeSession();
    }

}
