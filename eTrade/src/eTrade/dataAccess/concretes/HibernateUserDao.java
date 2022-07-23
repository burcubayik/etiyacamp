package eTrade.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	List<User> users = new ArrayList<>();

	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public List<User> getAll() {
	
		return users;
	}

}
