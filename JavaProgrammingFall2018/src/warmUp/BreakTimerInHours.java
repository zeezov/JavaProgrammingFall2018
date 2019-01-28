package warmUp;

import java.util.Scanner;

public class BreakTimerInHours {
	public static void main(String[] args) throws InterruptedException {

		// Hourly timer

		Scanner input = new Scanner(System.in);
		System.out.println("How many minutes");
		int minutes = input.nextInt();

		int hours = 0;
		int seconds = 0;

		if (minutes > 0) {
			minutes -= 1;
			hours = minutes / 60;
			minutes = minutes % 60;
			seconds = 60;

			while (hours >= 0 && minutes >= 0) {
				seconds--;
				Thread.sleep(1000);
				System.out.println(hours + " Hr " + minutes + " Min " + seconds + " Sec ");
				if (seconds == 0) {
					seconds = 60;
					minutes--;
					if (minutes == 0) {
						minutes = 59;
						hours--;
					}
				}
			}

		}

		if (hours == -1 && minutes == 59 && seconds == 60) {
			hours = 0;
			minutes = 0;
			seconds = 60;

			while (seconds > 0);
			seconds--;
			Thread.sleep(1000);
			System.out.println(minutes + " Min " + seconds + " Sec ");
		}

	}

}
