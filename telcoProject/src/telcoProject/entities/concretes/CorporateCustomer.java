package telcoProject.entities.concretes;

import java.util.List;

public class CorporateCustomer extends Customer{
	private String companyName;
	private String taxNumber;
	
	public CorporateCustomer() {
		super();
	}

	public CorporateCustomer(int id, String customerNumber,String companyName, String taxNumber,List<Subscription> subscriptions) {
		super(id, customerNumber,subscriptions);
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	

}
