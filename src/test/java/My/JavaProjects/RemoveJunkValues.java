package My.JavaProjects;

public class RemoveJunkValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="It comes from海鲜酱 芦橘馄饨 工合Work 007";
		s=s.replaceAll("[^\\sa-zA-Z0-9]", "");//used regular expression 
		System.out.println("After Junk Values Removed :"+s);	
		
	}
}
