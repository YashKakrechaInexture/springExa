package com.inexture.challenge;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/inexture/challenge/config.xml");  
		
        Student s1 = (Student)context.getBean("student1");
        
        System.out.println(s1);
        
	}
}
