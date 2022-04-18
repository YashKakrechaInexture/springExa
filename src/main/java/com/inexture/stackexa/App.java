package com.inexture.stackexa;

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
			
			@SuppressWarnings("unchecked")
			Stack<Integer> stack = (Stack<Integer>)context.getBean("stack");
			
			stack.push(1);
			stack.push(10);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(6);
			
			LOG.debug(stack);
			
			stack.pop();
			LOG.debug(stack);
			
			stack.add(1, 2);
			LOG.debug(stack);
			
			stack.remove(2);
			LOG.debug(stack);
			
			stack.push(17);
			stack.push(51);
			stack.push(6);
			stack.sort(null);
			LOG.debug(stack);
		
		}catch(Exception e) {
			LOG.fatal(e);
		}
	}
}
