package mentoring;

import java.util.Arrays;

public class PracticeInterviewQuestion {
	public static void main(String[] args) {
	     //Method will accept two Strings as parameter
	    // If stings equal print 'String1' and 'String2' are equal
//	     compWords("pen","pEn");
//	     compWordsNoKeysSen("pen","pEn");
	       compWprdsNoOrder("ABM","MBA");
	}
	   public static void compWords(String firstWord,String secondWord) {
	       if(firstWord.equals(secondWord)) {
	           
	           System.out.println("Words are equal");
	       }else {
	           System.out.println("Words are not equal");
	       }
	   }
	   
	   // Case of letters no matter
	   public static void compWordsNoKeysSen(String firstWord,String secondWord) {
	       if(firstWord.equalsIgnoreCase(secondWord)) {
	           
	           System.out.println("Words are equal");
	       }else {
	           System.out.println("Words are not equal");
	       }
	   }
	   
	// Void method will print true or false.
	// It accepts as parameter two string
	// If two string are equal print true. Order of letters in the word no matter
	// ["ABM","MBA"]  -> true
	// ["ABM","BMA"]  -> true
	// ["qwer","eqwr"] -> true
	// Otherways print false
	   public static void compWprdsNoOrder(String fWord,String sWord) {
	       char[] fWordArr = fWord.toCharArray();
	       char[] sWordArr = sWord.toCharArray();
	       Arrays.sort(fWordArr);
	       Arrays.sort(sWordArr);
	       for (int i = 0; i < sWordArr.length; i++) {
	          if(fWordArr[i] != sWordArr[i]) {
	              System.out.println("Words are not equal");
	          }
	       }
	           System.out.println("Words are equal"); 
	   }
	}


