package telcoProject.entities.concretes;

public class Product {
	private int id;
	private Service service;
	private Brand brand;
	private Cable cable;
	public Product() {
		super();
	}
	public Product(int id, Service service, Brand brand, Cable cable) {
		super();
		this.id = id;
		this.service = service;
		this.brand = brand;
		this.cable = cable;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Cable getCable() {
		return cable;
	}
	public void setCable(Cable cable) {
		this.cable = cable;
	}
	
	

}
