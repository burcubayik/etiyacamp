package kosgeb.entities;

import java.util.List;

public class Title {
	private int id;
	private String name;
	private List<Employee> employees;
	private List<TitlePermission>  titlePermissions;

	public Title() {
	}


	public Title(int id, String name, List<Employee> employees, List<TitlePermission> titlePermissions) {
		this.id = id;
		this.name = name;
		this.employees = employees;
		this.titlePermissions = titlePermissions;
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



	public List<Employee> getEmployees() {
		return employees;
	}



	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}





	public List<TitlePermission> getTitlePermissions() {
		return titlePermissions;
	}





	public void setTitlePermissions(List<TitlePermission> titlePermissions) {
		this.titlePermissions = titlePermissions;
	}
	
}
