package org.tarena.dang.dao;

import java.util.List;

import org.hibernate.Query;
import org.tarena.dang.pojo.Category;

public class HibernateCategoryDAO extends BaseDAO implements CategoryDAO{

	public List<Category> fetchByParentId(int parentId) {
		String hql = "select distinct c from Category c join fetch c.sublist where c.parentId=?";
		Query query = getSession().createQuery(hql);
		query.setInteger(0,parentId);
		return query.list();
	}

	public Category findById(int id) {
		Category cat = (Category)getSession().get(Category.class, id);
		return cat;
	}

}
