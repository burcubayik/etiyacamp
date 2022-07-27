package telcoProject.entities.concretes;

import java.util.List;

public class Customer {
	private int id;
	private String customerNumber;
	private List<CustomerAddress> customerAddresses;
	
	public Customer() {
		super();
	}
	
	public Customer(int id, String customerNumber, List<CustomerAddress> customerAddresses) {
		super();
		this.id = id;
		this.customerNumber = customerNumber;
		this.customerAddresses = customerAddresses;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	

	public List<CustomerAddress> getCustomerAddresses() {
		return customerAddresses;
	}

	public void setCustomerAddresses(List<CustomerAddress> customerAddresses) {
		this.customerAddresses = customerAddresses;
	}

	
	
}
