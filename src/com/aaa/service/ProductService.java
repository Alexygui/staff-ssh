package com.aaa.service;

import com.aaa.dao.ProductDao;
import com.aaa.domain.Product;

/**
 * 商品管理的业务层的类
 */
public class ProductService {
	
	// 业务层，注入DAO的类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	/**
	 * 业务层保存商品的方法
	 */
	public void save(Product product) {
		System.out.println("service中的save方法执行了");
		productDao.save(product);
	}
	
}
