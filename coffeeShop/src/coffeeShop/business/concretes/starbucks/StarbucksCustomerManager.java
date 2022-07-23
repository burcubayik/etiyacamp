package coffeeShop.business.concretes.starbucks;

import java.util.List;

import coffeeShop.business.abstracts.BaseCustomerManager;
import coffeeShop.business.abstracts.CustomerCheckService;
import coffeeShop.business.abstracts.CustomerNationalityIdCheckService;
import coffeeShop.business.constants.Messages;
import coffeeShop.dataAccess.abstracts.CustomerRepository;
import coffeeShop.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerRepository customerRepository;
	private CustomerCheckService customerCheckService;
	private CustomerNationalityIdCheckService customerNationalityIdCheckService;
	public StarbucksCustomerManager(CustomerRepository customerRepository, CustomerCheckService customerCheckService,CustomerNationalityIdCheckService customerNationalityIdCheckService  ) {
		this.customerCheckService = customerCheckService;
		this.customerRepository = customerRepository;
		this.customerNationalityIdCheckService = customerNationalityIdCheckService;
	}

	@Override
	public void add(Customer customer)  {
		if(customerCheckService.checkIfRealCustomer(customer) && !customerNationalityIdCheckService.checkIfNationalityIdExist(customer.getNationalityId())) {
			customerRepository.add(customer);
			System.out.println(Messages.added);
		}
		else {
			System.out.println("Kişi bulunamadı");
		}
		
		
	}
	@Override
	public void update(Customer customer) {
		customerRepository.update(customer);
		
	}
	@Override
	public void delete(Customer customer) {
		customerRepository.delete(customer);
		
	}
	@Override
	public List<Customer> getAll() {
		
		return customerRepository.getAll();
	}
	@Override
	public Customer getById(int id) {
		
		return customerRepository.getById(id);
	}

}
