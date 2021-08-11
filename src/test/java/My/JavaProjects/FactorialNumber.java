package My.JavaProjects;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number::");
		num=s.nextInt();
   Long fac =(long)1;
		for(int i=1;i<=num;i++) {
			 fac=i*fac;		 
		}
		System.out.println(fac);
	}

}
