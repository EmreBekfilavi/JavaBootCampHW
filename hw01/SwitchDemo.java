package hw01;

public class SwitchDemo {

	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel Geçtiniz!!");
			break;
		case 'B':
			System.out.println("Çok Güzel Geçtiniz!!");
			break;
		case 'C':
			System.out.println("İyi Geçtiniz!!");
			break;
		case 'D':
			System.out.println("Fena Değil, Geçtiniz!");
			break;
		case 'F':
			System.out.println("Malesef Kaldınız :( ");
			break;
		default:
			System.out.println("Lütfen geçerli bir harf notu giriniz..");

		}

	}

}
