package com.company.cglib.dao;

/**
 * @author Administrator, 2016年5月28日 下午4:17:46
 *
 */
public class CglibDAO {
	public String say(String input){
		System.out.println("cglib真实操作");
		return "Hello World" + input;
	}
}
