package com.inexture.stackexa;

import java.util.Arrays;
import java.util.Stack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	static final Logger LOG = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		try {
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("com/inexture/stackexa/stackconfig.xml"); 
			
			CustomStack stack = (CustomStack)context.getBean("customStack");
			System.out.println(stack);
			
			stack.push(5);
			stack.push(15);
			stack.push(1);
			stack.push(7);
			System.out.println("After push");
			System.out.println(stack);
			
			stack.add(1, 100);
			System.out.println("100 added at index 1");
			System.out.println(stack);

			stack.swap(0,2);
			System.out.println("After swap index 0 and 2");
			System.out.println(stack);
			
			stack.replace(1, 10);
			System.out.println("10 replaced at index 1");
			System.out.println(stack);
			
			stack.pop();
			System.out.println("After pop");
			System.out.println(stack);
			
			stack.remove(2);
			System.out.println("After remove");
			System.out.println(stack);
		
		}catch(Exception e) {
			LOG.fatal(e);
		}
	}
}
