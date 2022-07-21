package classesWithAttributes;

public class Main {

	public static void main(String[] args) {


		//constructordan set etme
		Product product=new Product(1,"Klavye","Lenova Klavye",6000,5);
		
		/*product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);*/
		
	/*	product.id=1;
		product.name="Laptop";
		product.description="Asus Laptop";
		product.price=5000;
		product.stockAmount=3;
		*/
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		System.out.println(product.getName());
		
		//System.out.println(product.name);

	}

}
