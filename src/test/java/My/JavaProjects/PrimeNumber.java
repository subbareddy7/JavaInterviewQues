package My.JavaProjects;

import java.util.Scanner;

public class PrimeNumber {

	static Scanner s = new Scanner(System.in);

	public static boolean isPrimeNumber(int num) {
		// TODO Auto-generated method stub
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				
				return false;
		}
		//System.out.println(num+" "+"is a primeNumber");
		return true;
	}
	
	public static void getPrimeNumbers(int num) {
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i))
			System.out.print(i+" ");
		}
	}
	
	public static void main(String args[]) {
		System.out.print("Enter value of Num:");
		 int num = s.nextInt();
		System.out.println("prime Number up to "+ num+" are");
		getPrimeNumbers(num);
		//isPrimeNumber(num);
	}

}
