package day23_Loops6;

public class StringReplace {
	public static void main(String[] args) {
		
		String sentence = "We are learning Java";
		System.out.println(sentence);
		
		sentence = sentence.replace("Java", "C#");
		
		System.out.println(sentence);
		
		//Can you replace word learning - practicing
		
		sentence = sentence.replace("learning", "practicing");
		
		System.out.println(sentence);
		
		sentence = sentence.replace("a", "A"); // will replace all 'a' with 'A'
		
		String word = "abcdefg java selenium";
		
		System.out.println(word.replace("ava", "unit"));
		
		String result = "123,456,001 result";
		//remove 'result' and commas
		
		result = result.replace("result", "").replaceAll(",", "");
		System.out.println(result);
		
	}

}
