

public class Instructor {
	private int id;
	private String firstName;
	private String lastName;
	private String branch;
	public Instructor() {
		super();
	}
	public Instructor(int id, String firstName, String lastName, String branch) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
