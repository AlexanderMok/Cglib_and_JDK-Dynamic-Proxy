package com.company.cglib.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author Administrator, 2016年5月28日 下午3:18:01
 *
 */
public class CglibProxyDemo implements MethodInterceptor{
	
	private Enhancer enhancer = new Enhancer();
	
	/**
	 * 根据父类（目标类）创建子类
	 * @param superclass
	 * @return
	 */
	public Object newProxyInstance(Class superclass){
		enhancer.setSuperclass(superclass);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	

	/**
	 * intercept all methods from target class
	 * @param object realObject instance
	 * @param method realObject method
	 * @param method params
	 * @param proxy proxyObject method instance
	 */
	@Override
	public Object intercept(Object object, Method method, Object[] params,
			MethodProxy proxy) throws Throwable {
		
		System.out.println("拦截父类方法之前。。。。");
		
		Object superObject = proxy.invokeSuper(object, params);
		
		System.out.println("拦截父类方法之后。。。。");
		return superObject;
	}

}
