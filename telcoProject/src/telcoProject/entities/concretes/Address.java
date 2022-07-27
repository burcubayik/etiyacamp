package telcoProject.entities.concretes;

import java.util.List;

public class Address {
	private int id;
	private String detail;
	private AddressType addressType;
	private List<CustomerAddress> customerAddresses;
	
	public Address() {
		super();
	}

	public Address(int id, String detail, AddressType addressType,List<CustomerAddress> customerAddresses) {
		super();
		this.id = id;
		this.detail = detail;
		this.addressType = addressType;
		this.customerAddresses=customerAddresses;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public List<CustomerAddress> getCustomerAddresses() {
		return customerAddresses;
	}

	public void setCustomerAddresses(List<CustomerAddress> customerAddresses) {
		this.customerAddresses = customerAddresses;
	}
	
	
}
