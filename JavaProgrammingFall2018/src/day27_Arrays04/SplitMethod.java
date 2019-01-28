package day27_Arrays04;

public class SplitMethod {
	public static void main(String[] args) {
		
		String words = "java-selenium-cucumber-testing-junit-eclipse-maven-git-github";
		
		String[] splittedWords = words.split("-");
		
		System.out.println(splittedWords.length);
		System.out.println(splittedWords[0]);
		
		for (String each : splittedWords) {
			System.out.print(each + " ");
		}
		
		System.out.println();
		
		
		String searchResults = "All categories “wooden spoon” 13,623 Results";
		// If you have a sentance as a string how do you find out how many words in it
		
		String[] split = searchResults.split(" ");
		
		System.out.print("Search Result has " + split.length + " words");
		System.out.println();
		
		// extract number of wooden spoon results and print it out
		
		System.out.print("Wooden spoon count: " + split[4]);
				
		
		
	}

}
