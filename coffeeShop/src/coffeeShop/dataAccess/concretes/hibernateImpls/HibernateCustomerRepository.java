package coffeeShop.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import coffeeShop.dataAccess.abstracts.CustomerRepository;
import coffeeShop.entities.concretes.Customer;

public class HibernateCustomerRepository implements CustomerRepository {

	List<Customer> customers;

	public HibernateCustomerRepository() {
		customers = new ArrayList<Customer>();
	}

	@Override
	public void add(Customer customer) {
		customers.add(customer);
		// System.out.println("Müşteri Eklendi : " + customer);
	}

	@Override
	public void update(Customer customer) {

	}

	@Override
	public void delete(Customer customer) {

	}

	@Override
	public List<Customer> getAll() {
		return customers;
	}

	@Override
	public Customer getById(int id) {
		return null;
	}

}
