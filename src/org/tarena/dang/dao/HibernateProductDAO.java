package org.tarena.dang.dao;

import java.util.List;

import org.hibernate.Query;
import org.tarena.dang.pojo.Book;
import org.tarena.dang.pojo.Product;

/**
 * ��ȡ�����ϼܵ�ǰsize����Ʒ
 * 
 * @author Administrator
 */
public class HibernateProductDAO extends BaseDAO implements ProductDAO {
/*
 * ������Ʒ��ѯ
*/
	public List<Product> findTopProduct(int size) {
		String hql = "from Product where hasDeleted=0 order by addTime desc";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(size);
		return query.list();
	}
/*
 * �༭�Ƽ�
 */
	public List<Book> findRecommandBook() {
		 String sql = "select * from d_product dp join d_book db on(dp.id=db.id) order by rand() limit 0,2";
		 Query query = getSession().createSQLQuery(sql).addEntity(Book.class);
		return query.list();
	}
	
/*
 * ��ҳ����
 */
	public List<Product> findProductByCatId(int cid, int page, int pageSize) {
		String hql = "select product " + "from Category c "
				+ "join c.pros product " + "where c.id=?";
		Query query = getSession().createQuery(hql);
		query.setInteger(0, cid);
		// ���÷�ҳ��ѯ����
		int begin = (page - 1) * pageSize;
		query.setFirstResult(begin);// ����ץȡ���
		query.setMaxResults(pageSize);// �������ץȡ��
		return query.list();
	}
/*
 * ��ȡ��n����������Ʒ
 */
	public List<Product> findHotProduct(int size){
	    String hql = "select p from Item i join i.product p group by p.id order by sum(i.productNum) desc ";	    
	    Query query = getSession().createQuery(hql);
	    query.setFirstResult(0);
	    query.setMaxResults(size);	    	    
	    return  query.list();
	}
	//����id���Ҹ���Ʒ����
	public Product findById(int id) {
		Product pro =
			(Product)getSession().get(Product.class, id);
		return pro;
	}
    //����id���Ҹ���Ʒ����ϸ��Ϣ
	public Object[] findProductDetailById(int id){
		String sql = "select dp.id,dp.product_name,dp.fixed_price,dp.dang_price,dp.description," +
				"dp.product_pic,db.author,db.publishing,db.word_number,db.which_edtion,db.total_page, " +
				"db.isbn,db.author_summary,db.catalogue from" +
				" d_product dp left outer join d_book db on dp.id=db.id where dp.id=?";
		Query query = getSession().createSQLQuery(sql);
		query.setInteger(0,id);
		Object[] obj = (Object[]) query.uniqueResult();
		return obj;
	}
	//���۸�������
	public List<Product> findProductOrderByPrice(int cid, int page, int pageSize) {
		String hql = "select product " + "from Category c "
		              + "join c.pros product " + "where c.id=? order by product.dangPrice desc";
        Query query = getSession().createQuery(hql);
        query.setInteger(0, cid);
		// ���÷�ҳ��ѯ����
		int begin = (page - 1) * pageSize;
		query.setFirstResult(begin);// ����ץȡ���
		query.setMaxResults(pageSize);// �������ץȡ��
		return query.list();
	}
	//���۸���������
	public List<Product> findProductOrderByPriceAsc(int cid, int page,
			int pageSize) {
		String hql = "select product " + "from Category c "
        + "join c.pros product " + "where c.id=? order by product.dangPrice";
		Query query = getSession().createQuery(hql);
		query.setInteger(0, cid);
		// ���÷�ҳ��ѯ����
		int begin = (page - 1) * pageSize;
		query.setFirstResult(begin);// ����ץȡ���
		query.setMaxResults(pageSize);// �������ץȡ��
		return query.list();
	}
	//��ʱ�併������
	public List<Product> findProdouctOrderByTime(int cid, int page, int pageSize) {		
		String hql = 
		    "select product from Category c join c.pros product where c.id=? order by product.addTime desc";
		Query query = getSession().createQuery(hql);
		query.setInteger(0, cid);
		//���÷�ҳ��ѯ����
		int begin = (page-1)*pageSize;
		query.setFirstResult(begin);//����ץȡ���
		query.setMaxResults(pageSize);//�������ץȡ��
		return query.list();
	}
	//��ʱ����������
	public List<Product> findProdouctOrderByTimeAsc(int cid, int page,
			int pageSize) {
		String hql = 
		    "select product from Category c join c.pros product where c.id=? order by product.addTime";
		Query query = getSession().createQuery(hql);
		query.setInteger(0, cid);
		//���÷�ҳ��ѯ����
		int begin = (page-1)*pageSize;
		query.setFirstResult(begin);//����ץȡ���
		query.setMaxResults(pageSize);//�������ץȡ��
		return query.list();
		
	}
}
