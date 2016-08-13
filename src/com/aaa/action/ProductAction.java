package com.aaa.action;

import com.aaa.domain.Product;
import com.aaa.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品管理的action类
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	//struts2和spring整合过程中按名称自动注入的类
	private ProductService aProductService;

	public void setaProductService(ProductService aProductService) {
		this.aProductService = aProductService;
	}
	
	private Product aProduct = new Product();
	// 模型驱动使用的类
	@Override
	public Product getModel() {
		return aProduct;
	}
	
}
