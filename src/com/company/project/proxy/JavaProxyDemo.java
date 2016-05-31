/**
 * 
 */
package com.company.project.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Administrator, 2016年5月22日 上午11:40:06
 * 代理：接收参数，代理返回处理后的数据
 */
public class JavaProxyDemo implements InvocationHandler {
	
	private Object realObject;
	
	
	public JavaProxyDemo(Object realObject) {
		this.realObject = realObject;
	}



	@Override //所有真实操作类执行时，所调用的方法
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("真实操作之前的操作");
		
		//参数中的proxy是代理类对象，不是被代理的真实对象
		
		Object object = null;
		try {
			object = method.invoke(realObject, args);
			
			//事务
			if(method.getName().startsWith("do")) {
//				HibernateSessionFactory.getInstance().commit();
			}
			
		} catch (Exception e) {
			if(method.getName().startsWith("do")) {
//				HibernateSessionFactory.getInstance().rollback();
			}
		} finally {
//			HibernateSessionFactory.getInstance().close();
		}
		
		System.out.println("真实操作之后的操作");
		
		return object;
	}

}
