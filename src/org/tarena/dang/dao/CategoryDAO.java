package org.tarena.dang.dao;

import java.util.List;

import org.tarena.dang.pojo.Category;

public interface CategoryDAO {
	/**
	 * 根据parent_id当条件查询
	 * @param parentId
	 * @return
	 */
    public List<Category>fetchByParentId(int parentId);
    public Category findById(int id);
}
