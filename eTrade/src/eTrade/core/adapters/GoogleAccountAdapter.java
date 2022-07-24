package eTrade.core.adapters;

import eTrade.business.abstracts.GoogleAccountService;
import googleAccount.GoogleAccountManager;

public class GoogleAccountAdapter implements GoogleAccountService {
	GoogleAccountManager googleAccountManager=new GoogleAccountManager();
	@Override
	public boolean googleLogin(String email) {
		googleAccountManager.googleAccount(email);
		return true;
	}

}
