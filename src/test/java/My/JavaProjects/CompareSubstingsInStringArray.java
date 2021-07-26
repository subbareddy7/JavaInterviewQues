package My.JavaProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareSubstingsInStringArray {

	public static void main(String[] args) {
		String[] a= {"ab","bc","ef","a"};
		String[] b= {"de","ff","ef"};
		String s="Helloo88";
		/*
		 * List<String> ls= new ArrayList<String>(); ls.add("ff"); List<String> ls1= new
		 * ArrayList<String>(); ls1.add("ff");
		 */
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if((a[i].contains(b[j])))	{
					System.out.print(a[i]+" "+b[j]);
				   }
				else {
					System.out.println(a[i]+" "+b[j]);
				}
			}
	}
		//validating a Charter in the given stings
		for(int i=0;i<=s.length()-1;i++) {
		    if((i!=s.length())&& s.charAt(i)==s.charAt(i+1)){
			System.out.println("Chareter duplicated:"+s.charAt(i));
			
		}
		   
}
	}
}