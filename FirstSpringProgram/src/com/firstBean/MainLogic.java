package com.firstBean;

import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainLogic {
	public static void main(String args[]) {
		
	Resource rs = new ClassPathResource("springConfig.xml");
	BeanFactory factory = new XmlBeanFactory(rs);
	Object o = factory.getBean("Welcome");
	welcomeBean w =(welcomeBean)o;
	System.out.println (w.getMessage());

	}

}
