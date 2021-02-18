package com.autowiring;

public class Employee {

	private Address address;

	/**
	 * @return the address
	 */
	public Address getAddress() {
		
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param address
	 */
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("inside Employee Constructor: ");
	}

	
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
