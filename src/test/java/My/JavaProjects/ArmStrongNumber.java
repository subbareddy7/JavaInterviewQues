package My.JavaProjects;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArmStrongNumber {
 
	
	static int r=0;
	static int t;
	static Scanner s=new Scanner(System.in);
	public static boolean isArmStrongNumber(int num) {
		int cube=0;
		t=num;
		while(num>0) {
		r=num%10;
		num=num/10;
		cube=cube+(r*r*r);	
	}
		if(t==cube) {
			//System.out.println(t+" is an ArmStorn number");
			return true;
		}
		else
			//System.out.println(t+" is not an ArmStorn number");
		return false;
	}
	
	public static void getArmStrongNumbers(int num) {
		System.out.println("ArmStrongNumbers up to "+num);
		for(int i=0;num>=i;i++)
			if(isArmStrongNumber(i))
			System.out.println(i+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		int num=s.nextInt();
		//isArmStrongNumber(num);
		getArmStrongNumbers(num);
	}

}
