package org.tarena.dang.pojo;

import java.util.List;
import java.util.Set;

/**
 * Category entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Category implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer turn;
	private String enName;
	private String name;
	private String description;
	private Integer parentId;

	// 追加一个属性,用于存储子类别信息
	private List<Category> sublist;
	// 追加一个属性,用于存储该类别包含的产品数量
	private int pnum = 0;
	// 追加一个属性,用于存储相关连的产品对象
	private Set<Product> pros;

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(Integer turn, String enName, String name) {
		this.turn = turn;
		this.enName = enName;
		this.name = name;
	}

	/** full constructor */
	public Category(Integer turn, String enName, String name,
			String description, Integer parentId) {
		this.turn = turn;
		this.enName = enName;
		this.name = name;
		this.description = description;
		this.parentId = parentId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTurn() {
		return this.turn;
	}

	public void setTurn(Integer turn) {
		this.turn = turn;
	}

	public String getEnName() {
		return this.enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public List<Category> getSublist() {
		return sublist;
	}

	public void setSublist(List<Category> sublist) {
		this.sublist = sublist;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public Set<Product> getPros() {
		return pros;
	}

	public void setPros(Set<Product> pros) {
		this.pros = pros;
	}

}