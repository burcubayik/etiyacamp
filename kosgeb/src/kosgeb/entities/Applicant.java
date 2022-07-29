package kosgeb.entities;

import java.util.Date;
import java.util.List;

public class Applicant extends User {
	private int id;
	private Date date;
	private String applicantNumber;
	private String projectNumber;
	private List<Application> applications;
	private List<BlackList> blackLists;

	public Applicant() {
	}

	
	public Applicant(int id, Date date, String applicantNumber, String projectNumber, List<Application> applications,
			List<BlackList> blackLists) {
		this.id = id;
		this.date = date;
		this.applicantNumber = applicantNumber;
		this.projectNumber = projectNumber;
		this.applications = applications;
		this.blackLists = blackLists;
	}

	public Applicant(int id, String email, String password, String address, int id1, Date date, String applicantNumber,
			String projectNumber, List<BankUser> bankUsers) {
		super(id, email, password, address, bankUsers);
		this.id = id1;
		this.date = date;
		this.applicantNumber = applicantNumber;
		this.projectNumber = projectNumber;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getApplicantNumber() {
		return applicantNumber;
	}

	public void setApplicantNumber(String applicantNumber) {
		this.applicantNumber = applicantNumber;
	}

	public String getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}


	public List<BlackList> getBlackLists() {
		return blackLists;
	}


	public void setBlackLists(List<BlackList> blackLists) {
		this.blackLists = blackLists;
	}
	
	
}
