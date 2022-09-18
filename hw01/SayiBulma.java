package hw01;

public class SayiBulma {

	public static void main(String[] args) {
		
		int[] sayilar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 15;
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
			System.out.println("Aradığınız sayı bu dizide mevcuttur. İyi Günler!!");
		} else {
			System.out.println("Aradığınız sayı bu dizide mevcut değildir. İyi Günler!!");
		}

	}

}
