package com.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("studentObj")
@Scope("prototype")
public class Student {
    @Value("Priyanka Kulkarni")
	private String name;
    @Value("Pune")
	private String city;
    @Value("#{phoneNo}") // String expression language
    private List<String> phoneNo;
	/**
	 * @return the phoneNo
	 */
	public List<String> getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

}
