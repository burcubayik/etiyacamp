package kosgeb.entities;

public class TitlePermission {
	private int id;
	private Title title;
	private Permission permission;
	
	public TitlePermission() {
	}

	public TitlePermission(int id, Title title, Permission permission) {

		this.id = id;
		this.title = title;
		this.permission = permission;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}
	

}
