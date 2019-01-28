package day20_Loop3_forLoop;

public class ReveseString {
	public static void main(String[] args) {
		
		String word = "java";
		String reversed = "";
		
		//using for loop-loop from length of word -1 until 0
		//and use either charAt or substring and add that character
		//to reversed string
		
		
		for (int i = word.length()-1; i >= 0; i--) {
			reversed = reversed + word.charAt(i); // also can be done with reversed += word.charAt(i)
			}
			
		System.out.println(reversed);
		
	}

}
