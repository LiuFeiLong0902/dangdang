package org.tarena.dang.service;

import java.util.List;

public interface CartService {

	/**
	 * 添加商品到购物车，如果已经购买过，则
	 * 返回false,否则添加该商品，返回true。
	 */
	public abstract boolean add(int id);

	/**
	 * 删除购物车中的某件商品
	 */
	public abstract void delete(int id);

	/**
	 * 恢复购物车中的某件商品
	 */
	public abstract void recovery(int id);

	/**
	 * 清除商品
	 *
	 */
	public abstract void clear();

	/**
	 * 修改购物车中的商品的数量
	 */
	public abstract void modify(int id, int qty);

	public abstract List<CartItem> getBuyList();

	public abstract List<CartItem> getDeleteList();
	/**
	 * 计算商品金额合计
	 * @return
	 */
	public abstract double cost();
    /**
     * 计算节省金额
     * @return
     */
	public abstract double sale();
}