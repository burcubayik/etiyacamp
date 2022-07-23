package eTrade.core.adapters;

import eTrade.business.abstracts.VerificationEmailService;
import eTrade.entities.concretes.User;
import verificationEmail.VerificationEmailManager;

public class VerificationEmailAdapter implements VerificationEmailService{
	VerificationEmailManager verificationEmailManager = new VerificationEmailManager();
	@Override
	public boolean verificationEmail(User user) {
		if(verificationEmailManager.verificationEmail(user.getEmail())) {
			System.out.println("Doğrulama e postası gönderildi");
			return true;
		}
		return false;
		
		
	
	}

}
