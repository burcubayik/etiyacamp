package kosgeb.entities;

import java.util.List;

public class User {

	private int id;
	private String email;
	private String password;
	private String address;
	private List<BankUser> bankUsers;

	public User() {
	}

	public User(int id, String email, String password, String address, List<BankUser> bankUsers) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.address = address;
		this.bankUsers = bankUsers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<BankUser> getBankUsers() {
		return bankUsers;
	}

	public void setBankUsers(List<BankUser> bankUsers) {
		this.bankUsers = bankUsers;
	}

}
