package kodlamaio;

public class Instructor extends User {
	private double salary;
	private String branch;

	public Instructor() {
		super();
	}


	public Instructor(int id, String firstName, String lastName, String emailAdress, String nationalIdentity,double salary, String branch) {
		super( id,  firstName,  lastName,  emailAdress,  nationalIdentity);
		this.salary = salary;
		this.branch = branch;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
