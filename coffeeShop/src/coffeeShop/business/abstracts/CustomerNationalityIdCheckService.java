package coffeeShop.business.abstracts;

import coffeeShop.entities.concretes.Customer;

public interface CustomerNationalityIdCheckService {
	boolean checkIfNationalityIdExist(String nationalityId);

}
