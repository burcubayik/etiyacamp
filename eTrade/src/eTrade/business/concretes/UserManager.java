package eTrade.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTrade.business.abstracts.GoogleAccountService;
import eTrade.business.abstracts.UserService;
import eTrade.business.abstracts.VerificationEmailService;
import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class UserManager implements UserService {
	UserDao userDao;
	VerificationEmailService verificationEmailService;
	GoogleAccountService googleAccountService;

	public UserManager(UserDao userDao, VerificationEmailService verificationEmailService,GoogleAccountService googleAccountService) {
		this.userDao = userDao;
		this.verificationEmailService = verificationEmailService;
		this.googleAccountService = googleAccountService;
	}

	@Override
	public void add(User user) throws Exception {
		checkIfUserFirstNameShort(user);
		checkIfUserLastNameShort(user);
		checkIfUserPasswordIsShort(user);
		checkIfUserEmailFormatWrong(user);
		checkIfUserEmailExists(user);
		checkIfVerificationEmailSended(user);

		userDao.add(user);

	}

	@Override
	public List<User> getAll() {

		return this.userDao.getAll();
	}

	@Override
	public User getById(int id) {
		
		return userDao.getById(id);
	}
	
	public void signIn(User user) {
		checkIfGoogleAccountSignIn(user);
	}
	
	public void login(User user) throws Exception {
		//checkIfUserPasswordIsEmpty(user);
		//checkIfUserEmailIsEmpty(user);
		checkIfEmailPassword(user);
		System.out.println(user.getEmail() +" Email / password Giris yapildi");
		
	}
	private void checkIfUserPasswordIsShort(User user) throws Exception {
		if (user.getPassword().length() < 6) {
			throw new Exception();
		}
	}

	private void checkIfUserEmailFormatWrong(User user) throws Exception {
		String REGEX = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(user.getEmail());

		if (!matcher.matches()) {
			throw new Exception();
		}
	}

	private void checkIfVerificationEmailSended(User user) throws Exception {
		if (!this.verificationEmailService.verificationEmail(user)) {

			throw new Exception();
		}
	}

	private void checkIfUserEmailExists(User user) throws Exception {

		for (User item : this.userDao.getAll()) {

			if (user.getEmail() == item.getEmail()) {
				throw new Exception();
			}
		}

	}

	private void checkIfUserFirstNameShort(User user) throws Exception {
		if (user.getFirstName().length() < 2) {
			throw new Exception();
		}
	}

	private void checkIfUserLastNameShort(User user) throws Exception {
		if (user.getLastName().length() < 2) {
			throw new Exception();
		}
	}
	private void checkIfGoogleAccountSignIn(User user) {
		if(googleAccountService.googleLogin(user.getEmail())) {
			System.out.println("Google girisi yapildi");
		}else {
			System.out.println("Google girisi yapilmadi.");
		}
	}
	
	private void checkIfEmailPassword(User user) throws Exception  {

		User userFromRepository = getById(user.getId());
        if(!(userFromRepository.getEmail() == user.getEmail() && userFromRepository.getPassword() == user.getPassword())) {
            throw new Exception("hata");
        }
	
	}

}
