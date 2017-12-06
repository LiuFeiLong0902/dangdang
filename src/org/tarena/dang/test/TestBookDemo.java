package org.tarena.dang.test;

import java.util.List;

import org.hibernate.Session;
import org.tarena.dang.pojo.Book;
import org.tarena.dang.util.HibernateUtil;

public class TestBookDemo {
	/*
	 * 测试Book
	 */
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();// 获得session
		List<Book> lists = session.createQuery("from Book").list();// 查询Book
		for (Book book : lists) {// 遍历Book
			System.out.println(book.getAuthor() + "," + book.getAuthorSummary());
		}
		HibernateUtil.closeSession();
	}
}
