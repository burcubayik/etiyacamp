package kosgeb.entities;

import java.util.Date;
import java.util.List;

public class Credit {
	private int id;
	private String name;
	private Date startedDate;
	private List<Application> applications;
	private List<CreditFeature> creditFeatures;

	public Credit(int id, String name, Date startedDate, List<Application> applications,
			List<CreditFeature> creditFeatures) {
		this.id = id;
		this.name = name;
		this.startedDate = startedDate;

		this.applications = applications;
		this.creditFeatures = creditFeatures;
	}

	public Credit() {
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

	public Date getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public List<CreditFeature> getCreditFeatures() {
		return creditFeatures;
	}

	public void setCreditFeatures(List<CreditFeature> creditFeatures) {
		this.creditFeatures = creditFeatures;
	}

}
