package telcoProject.entities.concretes;

import java.util.List;

public class Cable {
	private int id;
	private String type;
	private int length;
	private List<Product> products;
	
	public Cable() {
		super();
	}

	public Cable(int id, String type, int length,List<Product> products) {
		super();
		this.id = id;
		this.type = type;
		this.length = length;
		this.products =products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	

}
