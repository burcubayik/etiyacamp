package kodlamaioDbWorkshop;

public class UnionCustomer extends Customer {
	private String name;
	
	public UnionCustomer(int id, String customerNumber,Canal canal,String name) {
		super(id, customerNumber,canal);
		this.name = name;
	}
	public UnionCustomer() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
