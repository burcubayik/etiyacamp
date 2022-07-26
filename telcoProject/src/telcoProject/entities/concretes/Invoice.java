package telcoProject.entities.concretes;

import java.time.LocalDate;

public class Invoice {
	private int id;
	private Subscription subscription;
	private LocalDate dateCreated;
	private LocalDate dueDate;
	
	public Invoice() {
		super();
	}

	public Invoice(int id, Subscription subscription, LocalDate dateCreated, LocalDate dueDate) {
		super();
		this.id = id;
		this.subscription = subscription;
		this.dateCreated = dateCreated;
		this.dueDate = dueDate;
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
	
	

}
