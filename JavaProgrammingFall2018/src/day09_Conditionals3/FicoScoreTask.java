package day09_Conditionals3;


public class FicoScoreTask {
	public static void main(String[] args) {
		
		int creditScore = 300;
		String creditStatus = " ";
		int percentage = 0;
		
		if (creditScore >= 300 && creditScore <= 579) {
			creditStatus = "Very Poor";
			percentage = 16;
		} else if (creditScore >= 580 && creditScore <= 669) {
			creditStatus = "Fair";
			percentage = 18;
		} else if (creditScore >= 670 && creditScore <= 739) {
			creditStatus = "Good";
			percentage = 21;
		} else if (creditScore >= 740 && creditScore <= 799) {
			creditStatus = "Very Good";
			percentage = 25;
		} else if (creditScore >= 800 && creditScore <= 850) {
			creditStatus = "Exceptional";
			percentage = 20;
		} else if (creditScore < 0 || creditScore > 850) {
			creditStatus = "Invalid Score";
			percentage = 20;
		} 
		
		System.out.println("You credit score is: " + 
							creditScore + "\nand your credit satus is: " + 
							creditStatus + "\nand your percentage is: " + percentage + "%");
		
		
		
		
		
	}

}
