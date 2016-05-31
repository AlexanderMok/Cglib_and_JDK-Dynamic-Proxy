/**
 * 
 */
package com.company.project.dao.impl;

import com.company.project.dao.HelloDAO;

/**
 * @author Administrator, 2016年5月22日 下午2:31:10
 *
 */
public class HelloDAOImpl implements HelloDAO {

	@Override
	public String sayHello(String input) {
		System.out.println("真实操作");
		return "Hello World" + input;
	}

}
