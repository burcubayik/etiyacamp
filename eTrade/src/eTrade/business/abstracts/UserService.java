package eTrade.business.abstracts;

import java.util.List;

import eTrade.entities.concretes.User;

public interface UserService {
	void add(User user) throws Exception;
	List<User> getAll();
	User getById(int id);
	void login(User user) throws Exception;
	void signIn(User user);

}
