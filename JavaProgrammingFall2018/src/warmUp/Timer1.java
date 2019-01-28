package warmUp;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Timer1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	Scanner time = new Scanner(System.in);
	System.out.println("Please enter how many minutes of break you want: ");
	int minutes = time.nextInt();

	int seconds = 60;
	int zero = 0;

	int totalSec = minutes * seconds;
	

	do {

		totalSec -= minutes;

		do {
			

			if (seconds == 60) {

				TimeUnit.SECONDS.sleep((long) 1);
				System.out.println(minutes + " Minutes " + zero + " Seconds Left");
				--minutes;
				--seconds;
				
			}
			else if (minutes == 0) {
				TimeUnit.SECONDS.sleep((long) 1);
				System.out.println(seconds + " Seconds Left");
				--seconds;
				--totalSec;
				
			} else {

				TimeUnit.SECONDS.sleep((long) 1);
				System.out.println(minutes + " Minutes " + seconds + " Seconds Left");
				--seconds;
				--totalSec;
				        
	            
			}

			if (seconds == 0) {
				seconds = 60;
			}

		} while (totalSec > 0);

	} while (totalSec > 0);
	
	while (!(minutes==0)) {
		TimeUnit.SECONDS.sleep((long) 1);
		System.out.println(seconds + " Seconds Left");
		--seconds;
		--totalSec;
	}

	TimeUnit.SECONDS.sleep((long) 1);
	seconds = 0;
	System.out.println(seconds + " Seconds Left");
	

	System.out.println("↑→→→→→→→→→→→→→→→→→→→→→→→↓");
	System.out.println("↑                       ↓");
	System.out.println("↑  Break time is over!  ↓");
	System.out.println("↑                       ↓");
	System.out.println("↑←←←←←←←←←←←←←←←←←←←←←←←↓");
	
	

	time.close();

	//
	// Made by
	//
	// Saidahror Muhtarov
	// &
	// Serik Batyrkhanov
	//
	//
	// From:
	// CyberTek Batch 10
	// On:
	// September 16 2018
	//
	// Bug found by Cameron
	//
	// Patched & Regression 
	// tested by Said
	
		
	
	}

}
