package com.inexture.prop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		//ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\Yash\\eclipse-workspace2\\springExa\\src\\main\\java\\com\\inexture\\prop\\propconfig.xml"); 		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/inexture/prop/propconfig.xml"); 		
		Student s1 = (Student)context.getBean("student");
		
		System.out.println(s1);
	}
}
