package methods2;

public class Main {

	public static void main(String[] args) {
		
		
		String message="Bugün hava çok sıcak";	
		String newMessage=message.substring(0, 2);
		
		String newMessage1=giveCity();
		System.out.println(newMessage1);
		
		int sayi=total(5,7);
		System.out.println(sayi);
		
		//variable argumets
		int toplam=total2( 2,3,4,5,6,10);
		System.out.println(toplam);
	}	
		
	//substring bir değer return eder.
	//void bir String değere atanmaz.
	//total parametre göndererek kullandık.
	
	
	public static void add() {
			System.out.println("eklendi.");
		}
		
	public static void delete() {
		System.out.println("silindi.");
		}
		
	public static void update() {
		System.out.println("güncellendi.");
		}
	
	public static int total(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	//variable arguments kullanımı : int array gibi çalışır
	public static int total2(int... sayilar) {
		int toplam=0;
		for (int sayi : sayilar) {
			toplam+=sayi;
			
		}
		return toplam;
		
	}
	
	public static String giveCity() {
		return "Ankara";
	}

	}


