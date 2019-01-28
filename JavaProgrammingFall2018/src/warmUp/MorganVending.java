package warmUp;

public class MorganVending {
	public static void main(String[] args) {
		
		 int nickels = 0, dimes = 0, quarters = 0;
	        //Scanner sc = new Scanner(System.in);
	        int itemPrice = 33;
	        int money = 100 - itemPrice;
	        if(money >= 25) {
	             quarters = money/25;
	             money = money %25;
	             dimes = money/10;
	             money = money %10;
	             nickels = money/5;
	             money = money%5;
	        } else if (money >= 10) {
	             dimes = money/10;
	             money = money %10;
	             nickels = money/5;
	             money = money%5;
	        } else {
	            nickels = money/5;
	             money = money%5;
	        }
	        
	        System.out.println("Quarters:"+quarters +"\nDimes: "+dimes+"\nNickels: "+nickels);
	    }
	}


