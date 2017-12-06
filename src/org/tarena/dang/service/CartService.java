package org.tarena.dang.service;

import java.util.List;

public interface CartService {

	/**
	 * �����Ʒ�����ﳵ������Ѿ����������
	 * ����false,������Ӹ���Ʒ������true��
	 */
	public abstract boolean add(int id);

	/**
	 * ɾ�����ﳵ�е�ĳ����Ʒ
	 */
	public abstract void delete(int id);

	/**
	 * �ָ����ﳵ�е�ĳ����Ʒ
	 */
	public abstract void recovery(int id);

	/**
	 * �����Ʒ
	 *
	 */
	public abstract void clear();

	/**
	 * �޸Ĺ��ﳵ�е���Ʒ������
	 */
	public abstract void modify(int id, int qty);

	public abstract List<CartItem> getBuyList();

	public abstract List<CartItem> getDeleteList();
	/**
	 * ������Ʒ���ϼ�
	 * @return
	 */
	public abstract double cost();
    /**
     * �����ʡ���
     * @return
     */
	public abstract double sale();
}