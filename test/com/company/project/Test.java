/**
 * 
 */
package com.company.project;


import java.io.File;
import java.io.FilenameFilter;

import com.company.cglib.factory.CglibDAOFactory;
import com.company.project.factory.DAOFactory;

/**
 * @author Administrator, 2016年5月22日 下午2:40:19
 *
 */
public class Test {
	
	@org.junit.Test
	public void proxyTest(){
		System.out.println(DAOFactory.getInstance().sayHello("HEOP"));
	}
	
	@org.junit.Test
	public void cglibTest(){
		System.out.println(CglibDAOFactory.getInstance().say("cglib proxy"));
	}
	
	
	@org.junit.Test
	public void fileTest(){
		String[] names = new File("f:/111").list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith(".jpg");
			}
		});
		for(String temp : names) {
			System.out.println(temp);
		}
	}
	
}
