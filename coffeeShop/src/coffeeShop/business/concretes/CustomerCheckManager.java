package coffeeShop.business.concretes;

import coffeeShop.business.abstracts.CustomerCheckService;
import coffeeShop.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		return true;
	}
	

}
