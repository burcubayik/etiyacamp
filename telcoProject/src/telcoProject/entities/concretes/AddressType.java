package telcoProject.entities.concretes;

import java.util.List;

public class AddressType {
	private int id;
	private String name;
	private List<Address> addresses;
	
	public AddressType() {
		super();
	}

	

	public AddressType(int id, String name, List<Address> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public List<Address> getAddresses() {
		return addresses;
	}



	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	

}
