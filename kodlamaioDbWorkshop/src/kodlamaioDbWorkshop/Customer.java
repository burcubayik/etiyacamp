package kodlamaioDbWorkshop;

public class Customer {
	private int id;
	private String customerNumber;
	private Canal canal;
	
	public Customer() {
		super();
	}

	public Customer(int id, String customerNumber, Canal canal) {
		super();
		this.id = id;
		this.customerNumber = customerNumber;
		this.canal = canal;
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

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}
	

}
