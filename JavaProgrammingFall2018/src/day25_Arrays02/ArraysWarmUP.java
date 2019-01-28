package day25_Arrays02;

public class ArraysWarmUP {
	public static void main(String[] args) {

		/*
		 * Create and array called kitchenItems knife, wooden spoons, plates, cups,
		 * forks, pan, pot, trash can, fridge, dishwashwer and use for each loop. Inside
		 * for each loop creat switch case and discripe what each item in array does.
		 */

		String[] kitchenItems = { "Knife", "Wooden Spoons", "Plates", "Cups", "Forks", "Pan", "Pot", "Trash Can",
				"Fridge", "Dish Washer" };

		// System.out.println(kitchenItems.length);

		for (String kitchen : kitchenItems) {
			System.out.println(kitchen);
			
			//kitchen = kitchen.toLowerCase().trim(); to conver to Lowe Case
			//if there are spaces in array use trim case
			//kitchen = kitchn.trim()
			
			switch (kitchen) { // to convert to lower case (kitchen.toLowerCase())
			case "Knife":
				System.out.println("Is used for cutting");
				break;
			case "Wooden Spoons":
				System.out.println("Is used for hot soups");
				break;
			case "Plates":
				System.out.println("is used for to serve food");
				break;
			case "Cups":
				System.out.println("is used for coffee");
				break;
			case "Forks":
				System.out.println("Is used for salad");
				break;
			case "Pan":
				System.out.println("Is used to cook");
				break;
			case "Pot":
				System.out.println("Is used to store");
				break;
			case "Trash Can":
				System.out.println("Is used to collect trash");
				break;
			case "Fridge":
				System.out.println("Is used to cool drinks");
				break;
			case "Dish Washer":
				System.out.println("Is used for to wash dirty dishes");
				break;
			}

		}

	}

}
