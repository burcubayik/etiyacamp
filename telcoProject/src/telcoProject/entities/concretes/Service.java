package telcoProject.entities.concretes;

import java.util.List;

public class Service {
	private int id;
	private String name;
	private List<Subscription> subscriptions;
	public Service() {
		super();
	}
	public Service(int id, String name,List<Subscription> subscriptions) {
		super();
		this.id = id;
		this.name = name;
		this.subscriptions = subscriptions;
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
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	

}
