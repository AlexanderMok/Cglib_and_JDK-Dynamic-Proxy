package com.spring.proxy;


/**
 * @author Administrator, 2016年5月22日 下午8:17:13
 *
 */
public class SingletonDemo {
	
	private SingletonDemo(){
		System.out.println("in constructor");
	}
	
	private static class singletonHolderDemo {
		private static SingletonDemo  instance = new SingletonDemo();
	}
	
	public static void otherMethod(){
		System.out.println("otherMethod");
	}
	
	public static SingletonDemo getInstance(){
		return singletonHolderDemo.instance;
	}
	
	public static void main(String[] args) {
		SingletonDemo.otherMethod();
		SingletonDemo.getInstance();
		SingletonDemo.getInstance();
		
	}
}
