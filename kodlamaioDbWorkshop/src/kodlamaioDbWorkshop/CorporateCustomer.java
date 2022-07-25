package kodlamaioDbWorkshop;

public class CorporateCustomer extends Customer{
	private String title;
	private String taxNumber;
	public CorporateCustomer() {
		super();
	}
	public CorporateCustomer(int id, String customerNumber,Canal canal,String title, String taxNumber) {
		super(id, customerNumber,canal);
		this.title = title;
		this.taxNumber = taxNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	

}
