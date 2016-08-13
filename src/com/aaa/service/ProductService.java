package com.aaa.service;

import com.aaa.dao.ProductDao;

/**
 * 商品管理的业务层的类
 */
public class ProductService {
	
	// 业务层，注入DAO的类
	private ProductDao aProductDao;

	public void setaProductDao(ProductDao aProductDao) {
		this.aProductDao = aProductDao;
	}
	
}
