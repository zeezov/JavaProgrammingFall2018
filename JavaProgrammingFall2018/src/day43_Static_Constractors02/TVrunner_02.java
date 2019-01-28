package day43_Static_Constractors02;

public class TVrunner_02 {
	public static void main(String[] args) {
		
		TV_01 myTV = new TV_01(); // sometimes is called INSTANTIATION of myTV class
		TV_01 smartTV = new TV_01("Sharp");
		TV_01 cakeTV = new TV_01("HP");
		
		System.out.println(myTV.isOn());
		System.out.println(smartTV.isOn());
		System.out.println(cakeTV.isOn());
		
		myTV.turnOn();
		smartTV.turnOn();
		cakeTV.turnOn();
		
		System.out.println(myTV.isOn());
		System.out.println(smartTV.isOn());
		System.out.println(cakeTV.isOn());
		
		myTV.turnOn();
		
		myTV.setChannel(20);
		smartTV.setChannel(55);
		
		System.out.println("My TV: " + myTV.getChannel());
		System.out.println("My TV: " + smartTV.getChannel());
		System.out.println("CakeTV: " + cakeTV.getChannel());
		
		myTV.channelUP();
		smartTV.channelDown();
		
		System.out.println("My TV: " + myTV.getChannel());
		System.out.println("My TV: " + smartTV.getChannel());
		
		cakeTV.turnOff();
		cakeTV.setChannel(22); // will show error message because TV is off

		
		
	}

}
