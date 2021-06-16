package My.JavaProjects;

public class FindMissingNumInSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[]= {10,20,30,40,50,60,80};
		int sum=0;
		for(int i=0;i<s.length;i++) {
			sum=sum+s[i];	
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=0;j<90;j+=10) {
			 sum1=sum1+j;
		}
		
		System.out.println("Missing Number in the Series : "+(sum1-sum));
	}

}
