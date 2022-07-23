package coffeeShop.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import coffeeShop.dataAccess.abstracts.ProductRepository;
import coffeeShop.entities.concretes.Product;

public class HibernateProductRepository implements ProductRepository {
	

	private List<Product> list;

	public HibernateProductRepository() {
		list = new ArrayList<Product>();
	}

	@Override
	public void add(Product product) {
		list.add(product);

	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
