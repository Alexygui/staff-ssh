package com.aaa.action;

import com.aaa.domain.Product;
import com.aaa.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品管理的action类
 */
@SuppressWarnings("serial")
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	//struts2和spring整合过程中按名称自动注入的类
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	private Product product = new Product();
	// 模型驱动使用的类
	@Override
	public Product getModel() {
		return product;
	}
	public String save() {
		System.out.println("Action中的save方法执行了");
		productService.save(product);
		return NONE;
	}
}
