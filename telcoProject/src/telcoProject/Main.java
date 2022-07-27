package telcoProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import telcoProject.entities.concretes.Address;
import telcoProject.entities.concretes.AddressType;
import telcoProject.entities.concretes.Brand;
import telcoProject.entities.concretes.Cable;
import telcoProject.entities.concretes.Canal;
import telcoProject.entities.concretes.CorporateCustomer;
import telcoProject.entities.concretes.CustomerAddress;
import telcoProject.entities.concretes.IndividualCustomer;
import telcoProject.entities.concretes.Invoice;
import telcoProject.entities.concretes.Pack;
import telcoProject.entities.concretes.Payment;
import telcoProject.entities.concretes.Product;
import telcoProject.entities.concretes.Service;
import telcoProject.entities.concretes.Subscription;

public class Main {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		List<Address> addresses = new ArrayList<Address>();
		List<Subscription> subscriptions = new ArrayList<Subscription>();
		List<Invoice> invoices = new ArrayList<Invoice>();
		List<Payment> payments = new ArrayList<Payment>();
		List<CustomerAddress> customerAddresses = new ArrayList<>();
		List<Pack> packs = new ArrayList<>();

		AddressType addressType1 = new AddressType(1, "Ev", addresses);
		CorporateCustomer corporateCustomer1 = new CorporateCustomer(1, "123", "ABC", "12345278278", customerAddresses);
		Address address1 = new Address(1, "İzmir", addressType1, customerAddresses);
		CustomerAddress customerAddress = new CustomerAddress(1, address1, corporateCustomer1, subscriptions);
		Service service1 = new Service(1, "Telefon", subscriptions, products);
		Subscription subscription1 = new Subscription(1, corporateCustomer1, service1, LocalDate.parse("2022-01-01"),
				invoices, packs, customerAddress);
		Pack pack1 = new Pack(1, "Paket", 100, LocalDate.parse("2022-01-01"), LocalDate.parse("2022-02-02"),
				subscription1);
		Canal canal1 = new Canal(1, "Banka", payments);
		Canal canal2 = new Canal(1, "Kredi kartı", payments);
		IndividualCustomer individualCustomer1 = new IndividualCustomer(2, "789456", "1324545", "isim", "soyisim",
				customerAddresses);
		Payment payment1 = new Payment();
		payment1.setId(1);
		payment1.setCanal(canal1);
		payment1.setDate(LocalDate.parse("2022-07-26"));
		Invoice invoice1 = new Invoice(1, subscription1, LocalDate.parse("2022-07-25"), LocalDate.parse("2022-07-26"),
				payment1);
		payment1.setInvoice(invoice1);

		addresses.add(address1);
		payments.add(payment1);
		invoices.add(invoice1);
		subscriptions.add(subscription1);
		subscriptions.add(subscription1);
		customerAddresses.add(customerAddress);
		Brand brand1 = new Brand(1,"Hp",products);
		Cable cable1 = new Cable(1,"cat5",20,products);
		Product product1 = new Product(1,service1,brand1,cable1);
		System.out.println(subscription1.getCustomerAddress().getCustomer().getCustomerNumber());
		System.out.println(product1.getService().getSubscriptions().get(1).getCustomerAddress().getAddress().getDetail());
		
	}

}
