package reCapDemoClasses02;

public class FourOperations {

	public int Sum(int... num) {

		int sum = 0;

		for (int sumNum : num) {

			sum = sum + sumNum;

		}

		return sum;
	}

	public int Sub(int... num) {

		int sub = num[0];

		for (int i = 1; i < num.length; i++) {

			sub = sub - num[i];

		}

		return sub;
	}

	public double Multiple(double... num) {

		double multi = 1;

		for (double multiNum : num) {

			multi = multi * multiNum;

		}

		return multi;
	}

	public double Division(double... num) {

		double div = num[0];

		for (int i = 1; i < num.length; i++) {

			if (num[i] == 0) {

				div = 0;
				break;

			}

			div = div / num[i];

		}

		return div;
	}

	public void DivMessage(double num) {

		if (num == 0) {

			System.out.println("You can't divide any number to 0, the result will be Infinity");

		} else {

			System.out.println(num);

		}

	}

}
