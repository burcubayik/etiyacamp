package telcoProject.entities.concretes;

import java.util.List;

public class Customer {
	private int id;
	private String customerNumber;
	private List<Subscription> subscriptions;
	
	public Customer() {
		super();
	}
	
	public Customer(int id, String customerNumber, List<Subscription> subscriptions) {
		super();
		this.id = id;
		this.customerNumber = customerNumber;
		this.subscriptions = subscriptions;
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
	
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscription(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
}
