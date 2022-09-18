package hw01;

public class ReCapDemo2 {

	public static void main(String[] args) {

		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double maxNum = myList[0];
		double sum = 0;

		for (double num : myList) {

			if (maxNum < num) {
				maxNum = num;
			}

			sum = sum + num;
			System.out.println(num);
		}

		System.out.println("En buyuk sayi: " + maxNum);
		System.out.println("Toplam: " + sum);

	}

}
