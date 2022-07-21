package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();
		
	}
		public static void sayiBulmaca() {
			int [] numbers = {1,3,7,9};
			int numberToFound = 5;
			boolean isPresent = false;
			
			for (int number : numbers) {
				if (number == numberToFound) {
					isPresent = true;
					break;
				}
			}
			
			if(isPresent) {
				String mesaj="Sayı mevcuttur."+numberToFound;
				mesajVar(mesaj);
			
			}else {
				String mesaj="Sayı mevcut değildir : "+numberToFound;
				mesajVar(mesaj);
			}
		}
		
		public static void mesajVar(String mesaj) {
			System.out.println(mesaj);
		}
	}


