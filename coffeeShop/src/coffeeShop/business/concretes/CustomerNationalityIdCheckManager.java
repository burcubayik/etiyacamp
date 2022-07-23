package coffeeShop.business.concretes;

import coffeeShop.business.abstracts.CustomerNationalityIdCheckService;
import coffeeShop.dataAccess.abstracts.CustomerRepository;
import coffeeShop.entities.concretes.Customer;

public class CustomerNationalityIdCheckManager implements CustomerNationalityIdCheckService{
	private CustomerRepository customerRepository;
	public CustomerNationalityIdCheckManager(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public boolean checkIfNationalityIdExist(String nationalityId) {
		boolean exist = false;
		for(Customer customer: customerRepository.getAll()) {
			if(customer.getNationalityId() == nationalityId) {
				return true;
			}
		}
		
		return exist;
	}

}
