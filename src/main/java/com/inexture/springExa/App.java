package com.inexture.springExa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");  
        
        Student s1 = (Student)context.getBean("student1");
        System.out.println(s1);
//        System.out.println(s1.getSubject().getClass().getName());
//        System.out.println(s1.getSubjet());
//        System.out.println(s1.getMarks());
//        System.out.println(s1.getAnswer());
//        System.out.println(s1.getAddress());
        
        Student s2 = (Student)context.getBean("student2");
        System.out.println(s2);
        
        Student s3 = (Student)context.getBean("student3");
        System.out.println(s3);
        
        Student s4 = (Student)context.getBean("student4");
        System.out.println(s4);
        
    }
}
