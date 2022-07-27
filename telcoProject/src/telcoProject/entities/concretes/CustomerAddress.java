package telcoProject.entities.concretes;

import java.util.List;

public class CustomerAddress {
	private int id;
	private Address address;
	private Customer customer;
	private List<Subscription> subscriptions;
	
	public CustomerAddress() {
		super();
	}

	public CustomerAddress(int id, Address address, Customer customer,List<Subscription> subscriptions) {
		super();
		this.id = id;
		this.address = address;
		this.customer = customer;
		this.subscriptions = subscriptions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	

}
