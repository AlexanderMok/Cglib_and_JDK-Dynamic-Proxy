/**
 * 
 */
package com.spring.proxy;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author Administrator, 2016年5月22日 下午3:13:04
 *
 */
public class SpringBeforeDemo implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		
		//这里不需要调用真实操作方法，spring会自动调用
		System.out.println("method name: " + method.getName());
		
		System.out.println("args: " + args==null?0:args.length);
		
		System.out.println("object: " + target.getClass());
	}

}
