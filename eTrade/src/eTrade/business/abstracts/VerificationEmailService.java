package eTrade.business.abstracts;

import eTrade.entities.concretes.User;

public interface VerificationEmailService {
	boolean verificationEmail(User user);

}
