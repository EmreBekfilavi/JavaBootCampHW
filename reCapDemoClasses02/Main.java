package reCapDemoClasses02;

public class Main {

	public static void main(String[] args) {
		
		FourOperations fourOperations = new FourOperations();
		
		int resultSum = fourOperations.Sum(3,4,5,6);
		System.out.println(resultSum);
		
		int resultSub = fourOperations.Sub(20,3,5,6);
		System.out.println(resultSub);
		
		double resultMultiple = fourOperations.Multiple(6,5,4,3,2);
		System.out.println(resultMultiple);
		
		double resultDivision = fourOperations.Division(40,2,5);
		fourOperations.DivMessage(resultDivision);
		

	}

}
