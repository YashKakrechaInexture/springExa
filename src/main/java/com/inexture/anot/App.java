package com.inexture.anot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/inexture/anot/anotconfig.xml"); 
		
		Student s1 = (Student)context.getBean("student");
		Student s2 = (Student)context.getBean("student");
		
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s1 a1 : " + s1.getAddress().hashCode());
		System.out.println("s1 a2 : " + s1.getAddress2().hashCode());

		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s2 a1 : " + s2.getAddress().hashCode());
		System.out.println("s2 a2 : " + s2.getAddress2().hashCode());

	}
}
