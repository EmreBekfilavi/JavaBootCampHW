package hw01;

public class MuqSayilar {

	public static void main(String[] args) {
		int num = 6;
		int remainder = 0;
		int sum = 0;

		for (int i = 1; i < num; i++) {

			remainder = num % i;
			if (remainder == 0) {
				sum = sum + i;
			}
		}

		if (sum == num) {
			System.out.println("Sayı MÜQ sayıdır!!");
		} else {
			System.out.println("Sayı MÜQ değildir!!");
		}

	}

}
