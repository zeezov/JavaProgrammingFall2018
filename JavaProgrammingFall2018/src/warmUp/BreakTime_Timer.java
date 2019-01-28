package warmUp;

import java.util.Scanner;

public class BreakTime_Timer {
	public static void main(String[] args) throws InterruptedException {
		
		//Break Time Timer
		
		Scanner input = new Scanner (System.in);
			System.out.println("Please enter how long is break in minutes");
			
			int breakTime = input.nextInt();
			input.close();
		
		int totalSeconds = breakTime * 60;
		
		int minutes = 0;
		int seconds = 0;
		
		while (totalSeconds > 0) {
			
			minutes = totalSeconds / 60;
			seconds = totalSeconds % 60;
			totalSeconds--;
			System.out.println("Time remainging minutes: " + minutes + " : " + seconds);
			Thread.sleep(1000);
		}
		
		System.out.println("BREAK TIME IS OVER");
		
	}

}
