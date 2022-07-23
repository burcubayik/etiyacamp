package coffeeShop.business.abstracts;

import java.rmi.RemoteException;

import coffeeShop.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealCustomer(Customer customer);

}
