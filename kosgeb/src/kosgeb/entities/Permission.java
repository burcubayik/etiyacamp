package kosgeb.entities;

import java.util.List;

public class Permission {
	private int id;
	private String name;
	private List<TitlePermission> titlePermissions;
	
	public Permission() {
	}

	public Permission(int id, String name, List<TitlePermission> titlePermissions) {
		this.id = id;
		this.name = name;
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

	public List<TitlePermission> getTitlePermissions() {
		return titlePermissions;
	}

	public void setTitlePermissions(List<TitlePermission> titlePermissions) {
		this.titlePermissions = titlePermissions;
	}
	
	

}
