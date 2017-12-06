package org.tarena.dang.action.main;

import java.util.Iterator;
import java.util.List;

import org.tarena.dang.dao.CategoryDAO;
import org.tarena.dang.dao.HibernateCategoryDAO;
import org.tarena.dang.dao.HibernateProductDAO;
import org.tarena.dang.dao.ProductDAO;
import org.tarena.dang.pojo.Category;
import org.tarena.dang.pojo.Product;

public class BookListAction {
	//input
	private static int pid;//�����ID
	private static int cid;//��ǰ���ID
	private static int page = 1;//��ʾ�ڼ�ҳ
	private int value;//���������б�Ĳ鿼ֵ
	//output
	private int totalPage = 0;//��ҳ��
	private int totalPnum = 0;//ȫ������
	private static List<Category> subCats;//ͬ�����
	private static List<Product> pros;//��Ʒ��Ϣ
	//
	private String pName;
	private static int pageSize = 5;//һҳ��ʾ5��

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<Product> getPros() {
		return pros;
	}

	public void setPros(List<Product> pros) {
		this.pros = pros;
	}
    //Ĭ��ִ��ҵ�񷽷�
	public String execute(){
		System.out.println("��idΪ��"+pid);
		//����pidֵ��ȡsubCats
		CategoryDAO catDao = 
			new HibernateCategoryDAO();
		Category cat = catDao.findById(pid);// ���ݸ���pid�����ݿ������뵱ǰ�����ͬ��ͬ�����
		pName = cat.getName();
		subCats = cat.getSublist();		
        //ͳ��subCats�и��������֮��
		for(Category c:subCats){
			totalPnum+=c.getPnum();
		}		
		//����cid��ȡ�������Ĳ�Ʒ
		ProductDAO proDao = 
			new HibernateProductDAO();
		System.out.println("value:"+value);
		if(value==0){
			pros = proDao.findProductByCatId(cid,page,pageSize);			
		}
		if(value==1){
			pros = proDao.findProductOrderByPrice(cid,page,pageSize);
		}
		if(value==2){
			pros = proDao.findProductOrderByPriceAsc(cid,page,pageSize);
		}
		if(value==3){
			pros = proDao.findProdouctOrderByTime(cid,page,pageSize);
		}
		if(value==4){
			pros = proDao.findProdouctOrderByTimeAsc(cid,page,pageSize);
		}
		//TODO ����totalPage��ҳ��,������һҳ�Ƿ����
		for(Category c:subCats){
			if(cid==c.getId()){
				int x = c.getPnum();
				int b = x/pageSize;
				int t = x%pageSize;
				totalPage=(t==0?b:b+1);
			}
		}		
		return "success";
	}
	//�������
	public String categoryListBook(){
		System.out.println("���游idΪ��"+pid);		
		//����pidֵ��ȡsubCats
		CategoryDAO catDao = 
			new HibernateCategoryDAO();
		Category cat = catDao.findById(pid);// ���ݸ���pid�����ݿ������뵱ǰ�����ͬ��ͬ�����
		pName = cat.getName();
		subCats = cat.getSublist();		
        //ͳ��subCats�и��������֮��
		for(Category c:subCats){
			totalPnum+=c.getPnum();
		}		
		//����cid��ȡ�������Ĳ�Ʒ
		ProductDAO proDao = 
			new HibernateProductDAO();
		pros = proDao.findProductByCatId(
			   cid,page,pageSize);
		//TODO ����totalPage��ҳ��,������һҳ�Ƿ����
		for(Category c:subCats){
			if(cid==c.getId()){
				int x = c.getPnum();
				int b = x/pageSize;
				int t = x%pageSize;
				totalPage=(t==0?b:b+1);
			}
		}
		
		return "success";
	}
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public List<Category> getSubCats() {
		return subCats;
	}

	public void setSubCats(List<Category> subCats) {
		this.subCats = subCats;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getTotalPnum() {
		return totalPnum;
	}

	public void setTotalPnum(int totalPnum) {
		this.totalPnum = totalPnum;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public String getPName() {
		return pName;
	}

	public void setPName(String name) {
		pName = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
    
	

}
