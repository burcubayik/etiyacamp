package kodlamaioDbWorkshop;

public class Address {
	private int id;
	private String address;
	private Customer customer;
	public Address() {
		super();
	}
	public Address(int id, String address, Customer customer) {
		super();
		this.id = id;
		this.address = address;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
