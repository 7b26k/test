package com.bilal.BirdApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Application {
	public static void main(String[] args) {
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		Bird bird=(Bird) factory.getBean("bird");
		bird.getDetails();
				
	
	
	}

}
