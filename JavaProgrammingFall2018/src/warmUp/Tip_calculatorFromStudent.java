package warmUp;

import java.util.Scanner;

public class Tip_calculatorFromStudent {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		double tToPay = 0, tTip = 0, tPPers = 0, tipPers = 0, bill = 0;
		int tPerc=0, pp=0;
		
		System.out.println("Are you going to split the bill?");
		String split= scan.nextLine();
		System.out.println("how much is the bill?");
		bill=scan.nextDouble();
		
		System.out.println("How good was the service?");
		String serv=scan.next();
		if(serv.equals("poor")) {
			tPerc=5;
		}else if(serv.equals("fair")) {
			tPerc=10;
		}else if(serv.equals("good")) {
			tPerc=15;
		}else if(serv.equals("great")) {
			tPerc=20;
		}else if(serv.equals("excellent")) {
			tPerc=25;}
		tTip=bill*tPerc/100;
		 tToPay=bill+tTip;
		if(split.equals("yes")) {
			System.out.println("how many people?");
			pp=scan.nextInt();
			tPPers=tToPay/pp; 
			tipPers=tTip/pp;
		System.out.println("Number of people entered: "+ pp+ "\n"+ 
					 "Total to pay: "+tToPay+"\n"+"Total tip: "+tTip+"\n"+"Total per person: "+ tPPers+"\n"+"Tip per person: "+tipPers);
				
		}else{System.out.println("Total to pay: "+tToPay+"\n"+"Total tip: "+tTip);}
		
	}

}
