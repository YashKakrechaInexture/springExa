package com.inexture.springExa;

public class Address {
	private String home;
	private String city;
	
	public Address(String home, String city) {
		this.home = home;
		this.city = city;
	}
	
	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [home=" + home + ", city=" + city + "]";
	}
	
	
}
