package hw01;

public class MiniAsalProject {

	public static void main(String[] args) {
		int num = 13;
		int remainder = 0;

		for (int i = 2; i < num; i++) {
			remainder = num % i;
			if (remainder == 0) {
				System.out.println("Sayı Asal Değil!!");
				break;
			}

		}

		if (remainder > 0) {
			System.out.println("Sayı Asal!!!");
		}

	}

}
