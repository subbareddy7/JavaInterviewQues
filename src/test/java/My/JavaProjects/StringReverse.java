package My.JavaProjects;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the String to be reversed :");
     String s=sc.nextLine();
     String reverse = "";
     int len=s.length();
     
     for(int i=len-1;i>=0;i--) {
    	 reverse=reverse+s.charAt(i);
     }
     System.out.println("Reversed String : "+reverse);
     
     StringBuffer sb=new StringBuffer(s);
     System.out.println("Reverse String with Buffer:"+sb.reverse());
	}

	
	
	
}
