package telcoProject.entities.concretes;

import java.time.LocalDate;

public class Pack {
	private int id;
	private String name;
	private double price;
	private LocalDate dateStarted;
	private LocalDate dueDate;
	private Subscription subscription;
	
	public Pack() {
		super();
	}

	public Pack(int id, String name, double price, LocalDate dateStarted, LocalDate dueDate,
			Subscription subscription) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.dateStarted = dateStarted;
		this.dueDate = dueDate;
		this.subscription = subscription;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	

}
