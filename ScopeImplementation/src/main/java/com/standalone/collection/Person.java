package com.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private List<String> friends;
	private Map<String,Integer> feeStructure;
	private Properties properties;
	

	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}
	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	/**
	 * @return the feeStructure
	 */
	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}
	/**
	 * @param feeStructure the feeStructure to set
	 */
	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", properties=" + properties + "]";
	}
	public List<String> getFriends() {
		return friends;
	}
	/**
	 * @param friends the friends to set
	 */
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
}
