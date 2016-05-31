/**
 * 
 */
package com.company.project.factory;

import java.lang.reflect.Proxy;

import com.company.project.dao.HelloDAO;
import com.company.project.dao.impl.HelloDAOImpl;
import com.company.project.proxy.JavaProxyDemo;

/**
 * @author Administrator, 2016年5月22日 下午2:33:16
 * 
 */
public class DAOFactory {

	public static HelloDAO getInstance() {
		
		// loader是被代理类的接口的类加载器，interfaces是数组，h是实现了InvocaionHandler的代理类
		return (HelloDAO) Proxy.newProxyInstance(
				HelloDAO.class.getClassLoader(),
				new Class[] { HelloDAO.class }, new JavaProxyDemo(new HelloDAOImpl()));
	}
}
