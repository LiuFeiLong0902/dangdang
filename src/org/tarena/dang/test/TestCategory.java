package org.tarena.dang.test;

import java.util.List;

import org.tarena.dang.dao.HibernateCategoryDAO;
import org.tarena.dang.pojo.Category;

public class TestCategory {

	public static void main(String[] args) {
		org.tarena.dang.dao.CategoryDAO catDao = new HibernateCategoryDAO();
		List<Category> list = catDao.fetchByParentId(1);
		for (Category c1 : list) {
			System.out.println(c1.getName());
			for (Category c2 : c1.getSublist()) {
				System.out.println("===" + c2.getName());
			}
		}
	}
}
