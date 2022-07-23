package coffeeShop.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import coffeeShop.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public abstract void add(Customer customer) ;

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
