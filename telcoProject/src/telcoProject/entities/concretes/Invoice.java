package telcoProject.entities.concretes;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
	private int id;
	private Subscription subscription;
	private LocalDate dateCreated;
	private LocalDate dueDate;
	private Payment payment;
	
	public Invoice() {
		super();
	}

	public Invoice(int id, Subscription subscription, LocalDate dateCreated, LocalDate dueDate, Payment payments) {
		super();
		this.id = id;
		this.subscription = subscription;
		this.dateCreated = dateCreated;
		this.dueDate = dueDate;
		this.payment = payment;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	



}
