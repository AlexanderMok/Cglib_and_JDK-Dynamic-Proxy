package com.company.cglib.factory;


import com.company.cglib.proxy.CglibProxyDemo;
import com.company.cglib.dao.CglibDAO;

/**
 * @author Administrator, 2016年5月22日 下午2:33:16
 * 
 */
public class CglibDAOFactory {

	public static CglibDAO getInstance() {
		
		CglibProxyDemo proxy = new CglibProxyDemo();
		
		return (CglibDAO) proxy.newProxyInstance(CglibDAO.class);
	}
}
