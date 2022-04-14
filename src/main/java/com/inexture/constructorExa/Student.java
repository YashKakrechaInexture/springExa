package com.inexture.constructorExa;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

/**
 * If String constructor is there, it will always call String one, no ordering matters.
 * For 2 constructor orders from the top will be called
 * For >2 constructor orders from the bottom will be called
 * @author Yash
 *
 */
public class Student{ //implements InitializingBean, DisposableBean {
	private int a;
	private int b;
	//private int c;
	
//	public Student() {
//		System.out.println("default constructor");
//	}
	
	public Student(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int constructor");
	}
//	public Student(String a, String b) {
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//		System.out.println("String constructor");
//	}
//	
//	public Student(long a, long b) {
//		this.a = (int)a;
//		this.b = (int)b;
//		System.out.println("long constructor");
//	}
//	
//	public Student(float a, float b) {
//		this.a = (int)a;
//		this.b = (int)b;
//		System.out.println("float constructor");
//	}
//	
//	public Student(double a, double b) {
//		this.a = (int)a;
//		this.b = (int)b;
//		System.out.println("double constructor");
//	}
	
	

//	public Student(int a, int b, int c) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//	}
	
	public int add() {
		return this.a+this.b;
	}

	@PostConstruct
	public void init() {
		System.out.println("init method called.");
	}
	
	@PreDestroy
	public void des() {
		System.out.println("destroy method called.");
	}
	
//	public void destroy() throws Exception {
//		System.out.println("destroy method of defaualt called.");
//	}
//
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("init method of defaualt called.");
//	}
}
