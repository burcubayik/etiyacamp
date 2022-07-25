package kodlamaioDbWorkshop;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Canal canal=new Canal(1,"Internet");
		
		Customer customer=new IndividualCustomer(1,"12345",canal,"Betul","Kayam","12345678922");
		
		System.out.println(customer.getId());
		System.out.println(customer.getCustomerNumber());
		System.out.println(customer.getCanal().getName());
		
		
		CommercialActivity commercialActivity=new CommercialActivity((IndividualCustomer)customer,LocalDate.parse("2022-07-25"));
		//System.out.println(((IndividualCustomer)customer).getFirstName());

	}

}
