package eTrade.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTrade.business.abstracts.UserService;
import eTrade.business.abstracts.VerificationEmailService;
import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class UserManager implements UserService {
UserDao userDao;
VerificationEmailService verificationEmailService;
public UserManager(UserDao userDao,VerificationEmailService verificationEmailService) {
	this.userDao = userDao;
	this.verificationEmailService = verificationEmailService;
}
	@Override
	public void add(User user) throws Exception {
		checkIfUserPasswordIsShort(user);
		checkIfUserEmailFormatWrong(user);
		checkIfVerificationEmailSended(user);
		userDao.add(user);
		
	}
	@Override
	public List<User> getAll() {
		
		return this.userDao.getAll();
	}
	private void checkIfUserPasswordIsShort(User user) throws Exception {
		if(user.getPassword().length()<6) {
			throw new Exception();
		}
	}
	
	private void checkIfUserEmailFormatWrong(User user) throws Exception {
		String REGEX = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if(!matcher.matches()) {
			throw new Exception();
		}
	}
	
	private void checkIfVerificationEmailSended(User user) throws Exception {
		if(!this.verificationEmailService.verificationEmail(user)) {
			
			throw new Exception();
		}
	}
	
	

}
