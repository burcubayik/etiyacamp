package kosgeb.entities;

import java.util.Date;
import java.util.List;

public class Enterprise extends Applicant {
	private String companyName;
	private String taxNumber;

	public Enterprise() {
	}

	public Enterprise(String companyName, String taxNumber) {
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}

	public Enterprise(int id, Date date, String applicantNumber, String projectNumber, String companyName,
			String taxNumber, List<Application> applications,List<BlackList> blackLists) {
		super(id, date, applicantNumber, projectNumber, applications,blackLists);
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}

	public Enterprise(int id, String email, String password, String address, int id1, Date date, String applicantNumber,
			String projectNumber, String companyName, String taxNumber, List<BankUser> bankUsers) {
		super(id, email, password, address, id1, date, applicantNumber, projectNumber, bankUsers);
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
