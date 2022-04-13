package com.inexture.springExa;

import java.util.*;

public class Student {
	private int id;
	private String name;
	private List<String> subject;
	private Set<Integer> marks;
	private Map<String,Integer> answer;
	private Address address;
	
	public Student() {}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student(int id, String name, List<String> subject, Set<Integer> marks, Map<String, Integer> answer,
			Address address) {
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
		this.answer = answer;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	public Set<Integer> getMarks() {
		return marks;
	}

	public void setMarks(Set<Integer> marks) {
		this.marks = marks;
	}

	public Map<String, Integer> getAnswer() {
		return answer;
	}

	public void setAnswer(Map<String, Integer> answer) {
		this.answer = answer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + ", marks=" + marks + ", answer=" + answer
				+ ", address=" + address + "]";
	}
		
}
