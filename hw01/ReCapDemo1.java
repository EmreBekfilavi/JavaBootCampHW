package hw01;

public class ReCapDemo1 {

	public static void main(String[] args) {
		int num1 = 122;
		int num2 = 122;
		int num3 = 110;
		
		int maxNum;
		
		if(num1 >= num2) {
			if(num1 > num3) {
				maxNum = num1 ;
				System.out.println("En buyuk sayi : " + maxNum);
			}
			else {
				maxNum = num3 ;
				System.out.println("En buyuk sayi : " + maxNum);
			}
		}
		else {
			if(num2 >= num3) {
				maxNum = num2 ;
				System.out.println("En buyuk sayi : " + maxNum);
			}
			else {
				maxNum = num3 ;
				System.out.println("En buyuk sayi : " + maxNum);
			}
		}

	}

}
