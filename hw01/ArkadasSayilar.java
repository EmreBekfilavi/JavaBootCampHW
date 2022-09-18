package hw01;

public class ArkadasSayilar {

	public static void main(String[] args) {
		int num1 = 280;
		int num2 = 630;
		int sum1 = 0;
		int sum2 = 0;
		int remainder = 0;

		for (int i = 1; i < num1; i++) {

			remainder = num1 % i;
			if (remainder == 0) {
				sum1 = sum1 + i;
			}
		}

		for (int i = 1; i < num2; i++) {

			remainder = num2 % i;
			if (remainder == 0) {
				sum2 = sum2 + i;
			}
		}

		if (sum1 == num2) {
			if (sum2 == num1) {
				System.out.println("Sayılar arkadaş sayıdır!!");
			}
		} else {
			System.out.println("Sayılar arkadaş değildir!!");
		}

	}

}
