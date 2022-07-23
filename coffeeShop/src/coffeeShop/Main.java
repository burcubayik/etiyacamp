package coffeeShop;

import coffeeShop.adapters.MernisServiceAdapter;
import coffeeShop.business.abstracts.BaseCustomerManager;
import coffeeShop.business.abstracts.ProductService;
import coffeeShop.business.abstracts.SalesService;
import coffeeShop.business.concretes.CustomerNationalityIdCheckManager;
import coffeeShop.business.concretes.starbucks.StarbucksCustomerManager;
import coffeeShop.business.concretes.starbucks.StarbucksProductManager;
import coffeeShop.business.concretes.starbucks.StarbucksSalesManager;
import coffeeShop.dataAccess.abstracts.CustomerRepository;
import coffeeShop.dataAccess.concretes.hibernateImpls.HibernateCustomerRepository;
import coffeeShop.dataAccess.concretes.hibernateImpls.HibernateProductRepository;
import coffeeShop.dataAccess.concretes.hibernateImpls.HibernateSalesRepository;
import coffeeShop.entities.concretes.Campaign;
import coffeeShop.entities.concretes.Customer;
import coffeeShop.entities.concretes.Product;
import coffeeShop.entities.concretes.Sales;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerRepository customerRepository = new HibernateCustomerRepository();
		BaseCustomerManager customerManager = new StarbucksCustomerManager(customerRepository,
				new MernisServiceAdapter(), new CustomerNationalityIdCheckManager(customerRepository));
		ProductService productService = new StarbucksProductManager(new HibernateProductRepository());
		SalesService salesService = new StarbucksSalesManager(new HibernateSalesRepository());
		
		Customer customer1 = new Customer(1, "Burcu", "Bayık", 1998, "1111");
		Customer customer2 = new Customer(2, "Abdulkadir", "Demirel", 1998, "11111");
		Customer customer3 = new Customer(3,"Ümmü Betül","Kayam",1995,"1111");
		
		Product product1 = new Product(1, "Bardak", 30, "Starbucks yazan bardak");
		Product product2 = new Product(1, "Kahve", 50, "Burcunun kendi elleriyle yaptığı nefis türk kahvesi");
		Campaign campaign1 = new Campaign(1,"İkinci alınan ürüne % 50 indirim",50);
		
		Sales sales1 = new Sales(1, product1,customer2,campaign1);
		Sales sales2 = new Sales(2,product2,customer3,campaign1);
		Sales sales3 = new Sales(3,product1,customer3,campaign1);
		Sales sales4 = new Sales(4,product1,customer3,campaign1);

		customerManager.add(customer1);
		customerManager.add(customer2);
		customerManager.add(customer3);
		productService.add(product2);
		productService.add(product1);
		salesService.add(sales1);
		salesService.add(sales2);
		salesService.add(sales3);
		salesService.add(sales4);
		for (Customer customer : customerManager.getAll()) {
			System.out.println(customer.getFirstName());

		}

		System.out.println("Ürünler");
		for (Product product : productService.getAll()) {
			System.out.println(product.getName() + " / " + product.getDescription() + " / " + product.getUnitPrice() +" TL");
		}
		
		System.out.println("Satışlar");
		for (Sales sales : salesService.getAll()) {
			System.out.println(sales.getProduct().getName() +" adlı ürün " +
			sales.getProduct().getUnitPrice() + " TL yerine " +
			(sales.getProduct().getUnitPrice()-sales.getProduct().getUnitPrice()*sales.getCampaign().getDiscount()/100)
			+ " TL'ye "+sales.getCustomer().getFirstName() +
			" "+ sales.getCustomer().getLastName() + " kişisine satıldı.");
			
			
		}
		System.out.println(salesService.getAll().size());

	}

}
