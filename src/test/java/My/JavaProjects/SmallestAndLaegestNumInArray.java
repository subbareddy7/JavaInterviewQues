package My.JavaProjects;

import java.util.Arrays;

public class SmallestAndLaegestNumInArray {

	public static void main(String[] args) {
		
		int[] s= {-11,20,600,68,-999,0};

		int largest=s[0], smallest=s[0];
		
		for(int i=1;i<s.length;i++) {
			if(s[i]>largest)
				largest=s[i];
			else if(s[i]<smallest)
				smallest=s[i];
		}
		System.out.println("Given array::"+ Arrays.toString(s));
		System.out.println("LargestNumber::"+largest);
		System.out.println("SmallestNumber::"+smallest);
	}

}

