package com.aaa.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.aaa.domain.Product;

/**
 * 商品管理的DAO的类，实现的HibernateDaoSupport中有setSessionFactory()方法，可以通过spring注入sessionFactory
 */
public class ProductDao extends HibernateDaoSupport{
	/**
	 * DAO中的保存商品的方法 
	 */
	public void save(Product product) {
		System.out.println("DAO中的save方法执行了");
		this.getHibernateTemplate().save(product);
	}

}
