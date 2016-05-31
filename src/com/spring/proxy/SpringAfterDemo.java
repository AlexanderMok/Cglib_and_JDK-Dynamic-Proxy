/**
 * 
 */
package com.spring.proxy;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author Administrator, 2016年5月22日 下午3:38:42
 *
 */
public class SpringAfterDemo implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub

	}

}
