package hw02;

public class Methods {

	public static void main(String[] args) {

		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		
		int[] sayilar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 10;
		boolean flag = true;

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] == aranacak) {
				flag = true;
				break;
			} else {
				flag = false;
			}

		}

		if (flag == true) {
			mesajVer("Sayı dizide mevcuttur: " +aranacak);
		} else {
			mesajVer("Sayı dizide mevcut değildir: " +aranacak);
		}
	}
	
	
	public static void mesajVer(String mesaj) {
		
		System.out.println(mesaj);
		
	}
	

}
