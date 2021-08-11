package My.JavaProjects;

public class ReverseOnlyStringInJunkValue {

	public static void main(String args[]) {

		String s = "%%^^&#@())^SubbaReddy((%%!__+}{{||));";
		String onlyText = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("onlyText:" + onlyText);
		StringBuffer sb = new StringBuffer(onlyText);
		StringBuffer revString = sb.reverse();
		System.out.println("rev:" + revString);
		String s1 = s.replace(onlyText, revString);
		System.out.println("Otput:" + s1);

	}

}
