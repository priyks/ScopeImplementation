package annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("temp")
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
		System.out.println("Setter");
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
