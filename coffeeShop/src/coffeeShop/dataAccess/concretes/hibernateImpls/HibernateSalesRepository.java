package coffeeShop.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import coffeeShop.dataAccess.abstracts.SalesRepository;
import coffeeShop.entities.concretes.Sales;

public class HibernateSalesRepository implements SalesRepository {
	List<Sales> list;

	public HibernateSalesRepository() {
		list = new ArrayList<Sales>();
	}

	@Override
	public void add(Sales sales) {
		// TODO Auto-generated method stub
		list.add(sales);
	}

	@Override
	public void update(Sales sales) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Sales sales) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Sales> getAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Sales getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
