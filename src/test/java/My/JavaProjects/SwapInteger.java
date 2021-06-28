package My.JavaProjects;

public class SwapInteger {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		int temp;
		System.out.println("Before Swap of i:"+i);
		System.out.println("Before Swap of j:"+j);
		temp=i;
		i=j;
		j=temp;
		System.out.println("****AfterSwap****");
		System.out.println("Before Swap of i:"+i);
		System.out.println("Before Swap of j:"+j);	
		
		int i1=100;
		int j1=209;
		i1=i1+j1;
		j1=i1-j1;
		i1=i1-j1;
		
		System.out.println("Before Swap of i1:"+i1);
		System.out.println("Before Swap of j1:"+j1);	
		
		int i2=90;
		int j2=80;
		i2=i2*j2;
		j2=i2/j2;
		i2=i2/j2;
		System.out.println("Before Swap of i2:"+i2);
		System.out.println("Before Swap of j2:"+j2);
		
	}

}
