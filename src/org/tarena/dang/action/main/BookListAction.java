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
	private static int pid;//父类别ID
	private static int cid;//当前类别ID
	private static int page = 1;//显示第几页
	private int value;//进行排序列表的查考值
	//output
	private int totalPage = 0;//总页数
	private int totalPnum = 0;//全部数量
	private static List<Category> subCats;//同级类别
	private static List<Product> pros;//产品信息
	//
	private String pName;
	private static int pageSize = 5;//一页显示5条

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
    //默认执行业务方法
	public String execute(){
		System.out.println("父id为："+pid);
		//根据pid值获取subCats
		CategoryDAO catDao = 
			new HibernateCategoryDAO();
		Category cat = catDao.findById(pid);// 根据父类pid从数据库中找与当前类别相同的同级类别
		pName = cat.getName();
		subCats = cat.getSublist();		
        //统计subCats中各类别数量之和
		for(Category c:subCats){
			totalPnum+=c.getPnum();
		}		
		//根据cid获取所包含的产品
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
		//TODO 计算totalPage总页数,控制下一页是否可用
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
	//分类查找
	public String categoryListBook(){
		System.out.println("下面父id为："+pid);		
		//根据pid值获取subCats
		CategoryDAO catDao = 
			new HibernateCategoryDAO();
		Category cat = catDao.findById(pid);// 根据父类pid从数据库中找与当前类别相同的同级类别
		pName = cat.getName();
		subCats = cat.getSublist();		
        //统计subCats中各类别数量之和
		for(Category c:subCats){
			totalPnum+=c.getPnum();
		}		
		//根据cid获取所包含的产品
		ProductDAO proDao = 
			new HibernateProductDAO();
		pros = proDao.findProductByCatId(
			   cid,page,pageSize);
		//TODO 计算totalPage总页数,控制下一页是否可用
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
