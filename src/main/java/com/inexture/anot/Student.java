package com.inexture.anot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {
	@Autowired
	public Address address;
	@Autowired
	public Address address2;
	
	public Student() {
		
	}
	public Student(Address address, Address address2) {
		this.address = address;
		this.address2 = address2;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress2() {
		return address2;
	}
	public void setAddress2(Address address2) {
		this.address2 = address2;
	}
	@Override
	public String toString() {
		return "Student [address=" + address + ", address2=" + address2 + "]";
	}
	
	
}
