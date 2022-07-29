package kosgeb.entities;

import java.util.List;

public class Employee extends User {
	private Title title;
	private Department department;
	private String registrationNumber;

	public Employee() {
		super();
	}

	public Employee(Title title, Department department, String registrationNumber) {
		this.title = title;
		this.department = department;
		this.registrationNumber = registrationNumber;
	}

	public Employee(int id, String email, String password, String address, Title title, Department department,
			String registrationNumber, List<BankUser> bankUsers) {
		super(id, email, password, address, bankUsers);
		this.title = title;
		this.department = department;
		this.registrationNumber = registrationNumber;

	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
}
