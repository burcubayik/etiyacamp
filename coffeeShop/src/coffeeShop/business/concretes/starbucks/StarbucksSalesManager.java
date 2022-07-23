package coffeeShop.business.concretes.starbucks;

import java.util.List;

import coffeeShop.business.abstracts.SalesService;
import coffeeShop.business.constants.Messages;
import coffeeShop.dataAccess.abstracts.CampaignRepository;
import coffeeShop.dataAccess.abstracts.SalesRepository;
import coffeeShop.entities.abstracts.Entity;
import coffeeShop.entities.concretes.Campaign;
import coffeeShop.entities.concretes.Customer;
import coffeeShop.entities.concretes.Product;
import coffeeShop.entities.concretes.Sales;

public class StarbucksSalesManager implements SalesService {
	private SalesRepository salesRepository;

	public StarbucksSalesManager(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;

	}

	@Override
	public void add(Sales sales) {
		salesRepository.add(sales);
		System.out.println(Messages.added);
	}

	@Override
	public void update(Sales sales) {

	}

	@Override
	public void delete(Sales sales) {

	}

	@Override
	public List<Sales> getAll() {
		return salesRepository.getAll();
	}

	@Override
	public Sales getById(int id) {
		return null;
	}

}
