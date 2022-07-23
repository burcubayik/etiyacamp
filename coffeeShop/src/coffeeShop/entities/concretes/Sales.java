package coffeeShop.entities.concretes;

import coffeeShop.entities.abstracts.Entity;

public class Sales implements Entity{
	private int id;
	private Product product;
	private Customer customer;
	private Campaign campaign;
	public Sales() {
		super();
	}
	public Sales(int id, Product product, Customer customer, Campaign campaign) {
		super();
		this.id = id;
		this.product = product;
		this.customer = customer;
		this.campaign = campaign;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
