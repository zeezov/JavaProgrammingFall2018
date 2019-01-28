package day04_operators;

public class AgeCalulator {
	public static void main (String[] args) {
		
		//Program to calculate age for a given birth year
		//tasks: currentYear, yearOfBirth, age
		int currentYear = 2018;
		int yearOfBirth = 1987;
		int age = currentYear - yearOfBirth;
			
		//output should be if you are born <this> year then you are <this> many years old
			System.out.println("If you are born on " + yearOfBirth + " then you are " + age);
		
		//using string just another way to use
		String output =  "If you are born on " + yearOfBirth + " then you are " + age;
			System.out.println(output);
	}

}
