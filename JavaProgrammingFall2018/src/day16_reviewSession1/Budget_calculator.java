package day16_reviewSession1;

public class Budget_calculator {
	public static void main(String[] args) {

		/*
		 * Print items you can purchase based on your budget 
		 * < 80 -> you cannot buy anything
		 * 
		 * > 435 -> you can buy everything
		 *
		 * 
		 * if budget >= phone+watch you can buy phone+watch or phone+bag or watch + bag
		 * if budget >= phone+bag you can buy phone+bag or watch + bag if budget >=
		 * watch+bag you can buy watch+bag
		 * 
		 * if budget >= phone you can buy phone or watch+bag if budget >= watch you can
		 * buy watch or bag else just a watch
		 */

		double budget = 0;

		double phone = 250.0;
		double watch = 105.5;
		double bag = 80.0;

		double total = phone + watch + bag;
		System.out.println(total);
		System.out.println("=========================");

		if (budget < 80.0) {
			System.out.println("Cannot buy anything");
		} else if (budget >= 435.5) {
			System.out.println("You can buy all items");
		} else if (budget >= phone + watch) {
			System.out.println("You can buy Phone and Watch or Phone or Bag or Watch and Bag");
		} else if (budget >= phone + bag) {
			System.out.println("You can buy Phone and Bag or watch and bag");
		} else if (budget >= phone) {
			System.out.println("You can buy Phone or watch and bag");
		} else if (budget >= watch + bag) {
			System.out.println("You can buy watch and bag");
		} else if (budget >= watch) {
			System.out.println("You can buy watch or bag");
		} else {
			System.out.println("You can only buy bag");
		}

	}

}
