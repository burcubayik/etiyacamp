package telcoProject.entities.concretes;

import java.time.LocalDate;
import java.util.List;

public class Subscription {
	private int id;
	private Customer customer;
	private Service service;
	private LocalDate dateStarted;
	private List<Invoice> invoices;
	private List<Pack> packs;
	private CustomerAddress customerAddress;
	public Subscription() {
		super();
	}
	
	

	public Subscription(int id, Customer customer, Service service, LocalDate dateStarted, List<Invoice> invoices,
			List<Pack> packs, CustomerAddress customerAddress) {
		super();
		this.id = id;
		this.customer = customer;
		this.service = service;
		this.dateStarted = dateStarted;
		this.invoices = invoices;
		this.packs = packs;
		this.customerAddress = customerAddress;
	}



	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public LocalDate getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}



	public List<Pack> getPacks() {
		return packs;
	}



	public void setPacks(List<Pack> packs) {
		this.packs = packs;
	}



	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}
	

}
