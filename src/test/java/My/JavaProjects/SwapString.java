package My.JavaProjects;

public class SwapString {
	
	public static void main(String args[]) {
		String a="Subba";
		String b="ReddyA";
		System.out.println("Before Swap of A:"+a);
		System.out.println("Before Swap of B:"+b);
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("*****After Swap*****");
		System.out.println("Before Swap of A:"+a);
		System.out.println("Before Swap of B:"+b);
		
	}

}
