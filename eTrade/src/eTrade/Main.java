package eTrade;

import eTrade.business.abstracts.UserService;
import eTrade.business.concretes.UserManager;
import eTrade.core.adapters.VerificationEmailAdapter;
import eTrade.dataAccess.concretes.HibernateUserDao;
import eTrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception {
		User user1 = new User(1, "Burcu", "Bayık", "SS@AAA.NN", "r6g5gg");
		UserService userService = new UserManager(new HibernateUserDao(),new VerificationEmailAdapter());
		userService.add(user1);
		
		for (User user : userService.getAll()) {
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			
		}

	}

}
