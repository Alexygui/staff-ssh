package com.aaa.domain;
/**
 *商品的实体类 
 */
public class Product {
	private int pid;
	private String pname;
	private Double price;
	
	public Product() {}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
