package My.JavaProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringManipulation {

	public static void main(String[] args) { // TODO Auto-generated method stub
	  
	  String s="SubbaReddy how are you"; char ch[]=s.toCharArray();
	  System.out.println("String to CharacterArray:"+Arrays.toString(ch));// To conver the string to chracter array
	  System.out.println("String to UpperCase:"+s.toUpperCase());
	  System.out.println("String to LowerCase:"+s.toLowerCase());
	  
	  // how to reverse the words in String and swap 1st and last elements
	  ArrayList<String> al= new ArrayList<String>();
	  ArrayList al2= new ArrayList(); 
	  String ss[]=s.split(" "); 
	  for(String s1:ss) {
		  al.add(s1);
		  }
	  //swap 1st and last element Collections.swap(al, 0, 3);
	  System.out.println("After swap of 1st and last elements:"+al); 
	  //reversing the middle elements 
	  for(String al1:al) {
		  if((al1.contains("SubbaReddy")||al1.contains("you"))) {
			  al2.add(al1);
			  }
		  else { StringBuffer SB=new
	  StringBuffer(al1); 
	  al2.add(SB.reverse().toString()); } }
	  System.out.println("After swap and revers elements:"+al2);
	  ArrayList<String> list = new ArrayList<String>(); 
	  list.addAll(al2);
	  //System.out.println(list);
	  //trying to convert the al2 to string
	  String listString = ""; 
	  StringBuilder sb = new StringBuilder(); 
	  for (String sh: list) { sb.append(sh);
	  sb.append(" "); } 
	  listString =sb.toString();
	  System.out.println("OutPut:"+listString);
	  //To Print How Many no of String in given String
		howManyStrings("jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.");
	  }

	public static int howManyStrings(String sentence) {
		// Write your code here
		String s1 = sentence.replaceAll("[^a-zA-Z]", " ").trim().replaceAll("", "");
		String s2[] = s1.split(" ");
		ArrayList al = new ArrayList();
		ArrayList<String> all = new ArrayList<String>();
		for (String s : s2) {
			if (!s.isEmpty())
				all.add(s);
		}
		for (String al2 : all) {
			al.add(al2);
		}
		System.out.println(al);
		int output = all.size();
		System.out.println(output);
		return output;
	}


	

}
