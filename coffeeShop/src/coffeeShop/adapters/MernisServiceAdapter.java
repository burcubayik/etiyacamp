package coffeeShop.adapters;

import coffeeShop.business.abstracts.CustomerCheckService;
import coffeeShop.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		
		try {
		
		KPSPublicSoap kpsPublicSoap  = new KPSPublicSoapProxy();
		return kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		
		}catch(Exception e ){
			System.out.println("Giriş bilgileri doğru değil!");
			
		}
		return false;
	}

}
