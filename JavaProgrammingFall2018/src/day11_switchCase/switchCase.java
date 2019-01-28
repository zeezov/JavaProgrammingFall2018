package day11_switchCase;

public class switchCase {
	public static void main (String[] args) {
		//1 - lobby, 2 - google, 3 - Cybertek, 4 - apple
		int floor = 3;
		
		if (floor == 1) {
			System.out.println("Lobby");
		} else if (floor == 2) {
			System.out.println("Google");
		} else if (floor == 3) {
			System.out.println("CyberTek");
		} else if (floor == 4) {
			System.out.println("Apple");
		} else {
			System.out.println("No such floor");
		}
		
		// Now using switch
		
		switch (floor) {
		case 1:
			System.out.println("Lobby");
			break;
		case 2:
			System.out.println("Google");
			break;
		case 3:
			System.out.println("CyberTek");
			break;
		case 4:
			System.out.println("Apple");
			break;
		default:
			System.out.println("No such flloor");
		}
	}

}
