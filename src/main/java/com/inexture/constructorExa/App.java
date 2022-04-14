package com.inexture.constructorExa;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main( String[] args ) {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/inexture/constructorExa/config.xml");  
		context.registerShutdownHook(); //this will tell JVM to destroy bean when bean's work is over
		//context.close(); //this will call destroy method imidiatly, if object not assigned then it will generate runtime error
		
        Student s1 = (Student)context.getBean("student1");
        
        System.out.println(s1.add());
        
        
	}
}
