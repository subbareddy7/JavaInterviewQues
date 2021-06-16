package My.JavaProjects;

import java.util.Scanner;

public class ReverseIntegger {

	static long ReverseInt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner S=new Scanner(System.in);
		System.out.print("Enter an Integer :");
		long value=S.nextInt();
		while(value!=0) {
			ReverseIntegger.ReverseInt=ReverseIntegger.ReverseInt*10+value%10;
			value=value/10;
			
		}
		System.out.println("Reversed Integer is:"+ReverseInt);
		
		
		//String Buffers//
        int value1=20040;
		StringBuffer sb=new StringBuffer(String.valueOf(value1));
		System.out.println("Reverse Integer by String Buffer :" + sb.reverse());
	
	}
	
}
