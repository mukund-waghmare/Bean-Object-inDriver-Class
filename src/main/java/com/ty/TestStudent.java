package com.ty;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext con=new ClassPathXmlApplicationContext("conf.xml");
		
		Student student=(Student)con.getBean("student");
		student.run();
		
	}

}
