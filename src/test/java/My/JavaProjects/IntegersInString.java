package My.JavaProjects;

import java.util.Scanner;

public class IntegersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string with integers :");
		String name=s.nextLine();
	//	System.out.println(" Intergers :"+ name.replaceAll("[^a-z][A-Z]", ""));  --to get the String form the given list of mixed word/phrase(ex:12378Tybrfgh78456)
		System.out.println(" Intergers :"+ name.replaceAll("[^0-9]", "")); //to get the integer from the given String
	}
}
