package org.tarena.dang.dao;

import java.util.List;

import org.tarena.dang.pojo.Category;

public interface CategoryDAO {
	/**
	 * ����parent_id��������ѯ
	 * @param parentId
	 * @return
	 */
    public List<Category>fetchByParentId(int parentId);
    public Category findById(int id);
}
