package My.JavaProjects;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"Java","C","Python","C++","C Sharp","C Sharp"};
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					System.out.println("The Duplicate Value in list is:: "+s[j]);
				}
			}
		}
		
		Set<String> store= new HashSet<String>();
		for(String duplicate:s)
			if(store.add(duplicate)==false)
				System.out.println("The Duplicate Value in list is:: "+duplicate);

	}

}
