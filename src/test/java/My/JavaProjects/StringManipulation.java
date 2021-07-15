package My.JavaProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="SubbaReddy how are you";
		String ssss[]= {};
		char ch[]=s.toCharArray();
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
         Collections.swap(al, 0, 3);
         System.out.println(al);
       for(String al1:al) {
		if((al1.contains("SubbaReddy")|| al1.contains("you"))) {
			 al2.add(al1);  
		}
			else {
         StringBuffer SB=new StringBuffer(al1);
         al2.add(SB.reverse());
         } 
		}
		System.out.println(al2);
		
         
    	 
    	 
     }}
	



