package kodlamaioDbWorkshop;

import java.time.LocalDate;

public class FinancialStatement {
	private int id;
	private Customer customer;
	private LocalDate dateTime;
	private double cost;
	
	public FinancialStatement() {
		super();
	}

	public FinancialStatement(int id, Customer customer, LocalDate dateTime, double cost) {
		super();
		this.id = id;
		this.customer = customer;
		this.dateTime = dateTime;
		this.cost = cost;
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

	public LocalDate getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDate dateTime) {
		this.dateTime = dateTime;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	

}
