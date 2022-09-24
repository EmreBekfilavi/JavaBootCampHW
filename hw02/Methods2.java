package hw02;

public class Methods2 {

	public static void main(String[] args) {

		int sumNumbers = sum(2, 3, 4);
		System.out.println(sumNumbers);

		int subNumbers = sub(5, 18, 5);
		System.out.println(subNumbers);

		double multiNumbers = multiple(2, 3, 4);
		System.out.println(multiNumbers);

		double divNumbers = division(20, 5, 2);
		System.out.println(divNumbers);

	}

	public static int sum(int... num) {

		int sum = 0;

		for (int sumNum : num) {

			sum = sum + sumNum;

		}

		return sum;
	}

	public static int sub(int... num) {

		int sub = num[0];

		for (int i = 1; i < num.length; i++) {

			sub = sub - num[i];

		}

		return sub;
	}

	public static double multiple(double... num) {

		double multi = 1;

		for (double multiNum : num) {

			multi = multi * multiNum;

		}

		return multi;
	}

	public static double division(double... num) {

		double div = num[0];

		for (int i = 1; i < num.length; i++) {

			div = div / num[i];

		}

		return div;
	}

}
