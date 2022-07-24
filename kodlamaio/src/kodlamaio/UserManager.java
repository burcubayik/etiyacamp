package kodlamaio;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	private List<User> users;

	public UserManager() {
		users = new ArrayList<>();
	}

	public void add(User user) {
		users.add(user);
		System.out.println("Eklendi");
	}

	public void update(User user) {

		System.out.println("Güncellendi");
	}

	public void delete(User user) {

		System.out.println("Silindi");
	}

	public List<User> getAll() {

		return users;
	}
}
