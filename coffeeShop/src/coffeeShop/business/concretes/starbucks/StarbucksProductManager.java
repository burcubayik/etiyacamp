package coffeeShop.business.concretes.starbucks;

import java.util.List;

import coffeeShop.business.abstracts.ProductService;
import coffeeShop.dataAccess.abstracts.ProductRepository;
import coffeeShop.entities.concretes.Product;

public class StarbucksProductManager implements ProductService {
	private ProductRepository productRepository;
	public StarbucksProductManager(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public void add(Product product) {
		productRepository.add(product);
		
	}

	@Override
	public void update(Product product) {
		
	}

	@Override
	public void delete(Product product) {
		
	}

	@Override
	public List<Product> getAll() {
		return productRepository.getAll();
	}

	@Override
	public Product getById(int id) {
		return null;
	}

}
