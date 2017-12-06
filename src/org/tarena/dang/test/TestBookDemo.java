package org.tarena.dang.test;

import java.util.List;

import org.hibernate.Session;
import org.tarena.dang.pojo.Book;
import org.tarena.dang.util.HibernateUtil;

public class TestBookDemo {
	/*
	 * ����Book
	 */
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();// ���session
		List<Book> lists = session.createQuery("from Book").list();// ��ѯBook
		for (Book book : lists) {// ����Book
			System.out.println(book.getAuthor() + "," + book.getAuthorSummary());
		}
		HibernateUtil.closeSession();
	}
}
