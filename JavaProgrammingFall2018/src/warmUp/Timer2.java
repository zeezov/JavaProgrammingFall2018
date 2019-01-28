package warmUp;

import java.util.Scanner;

public class Timer2 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the minutes");
		int minutes=scan.nextInt();
		for (int i=minutes;0<minutes;--i) {
			i--;
			for (int z=59; z>0;--z) {
				System.out.println(i+" minutes and "+z+" seconds left");
				if(i==0&&z==0)break;
					try {Thread.sleep(1000);}
					 catch (InterruptedException e1) {e1.printStackTrace();}
					if(i<0&&z<0)break;
				}
			}
		scan.close();
	}

}
