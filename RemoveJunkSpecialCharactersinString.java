package SimpleJavaproblems;

public class RemoveJunkSpecialCharactersinString {

	public static void main(String[] args) {
		
		String str = "$%^^###$$@@## String value is 789";
		
		String str1 = "%$$$^%^%&*&%$%#$ Springboot @###$$ Application 0006";
		
		String output_str = str.replaceAll("[^a-zA-Z0-9]", "");  // ^ - char operator , 
		//What char operator will do is other than this [a-zA-Z0-9] if it finds anything else, it will be replaced by empty
		//this is called regular expression 
		String output_str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(output_str);
		System.out.println(output_str1);
	}
}
