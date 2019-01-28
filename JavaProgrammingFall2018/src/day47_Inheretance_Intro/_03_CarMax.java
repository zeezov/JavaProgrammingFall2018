package day47_Inheretance_Intro;

public class _03_CarMax extends Object {

	public static void main(String[] args) {
		
		_01_Vehicle vehicle = new _01_Vehicle();
		
		vehicle.makeAndModel = "Subaru OUtback";
		vehicle.year = 2018;
		vehicle.maxSpeed = 140;
		vehicle.milage = 80;
		
		vehicle.drive();
		vehicle.stop();
		
		
		_02_Car car = new _02_Car();
		
		car.makeAndModel = "Toyota 4Runner Limited Night Shade";
		car.year = 2019;
		car.maxSpeed = 120;
		car.horsePower = 234;
		car.milage = 40;
		
		car.doUber();
		car.drive();
		car.stop();
		
		// callling static method from _01_Vehicle Parent Class
		_02_Car.service();
		
		System.out.println("===TRAIN===");
		
		_04_Train train = new _04_Train();
		
		train.makeAndModel = "Cyber Train 10";
		train.year = 2019;
		train.maxSpeed = 200;
		train.ticketPrice = 80.0;
		train.milage = 60;
		
		train.drive();
		train.leaveStation();
		train.stop();
		
		System.out.println("===ELECTRIC CAR===");
		
		_05_ElectricCar tesla = new _05_ElectricCar();
		
		tesla.makeAndModel = "Tesla Model S";
		tesla.year = 2015;
		tesla.maxSpeed = 200;
		tesla.horsePower = 432;
		tesla.milage = 222;
		
		tesla.doUber();
		tesla.charge();
		tesla.drive();
		
		System.out.println("Has Battery? " + _05_ElectricCar.hasBattery);
		
		System.out.println("===Static Service Calls");
		
		_01_Vehicle.service();
		_02_Car.service();
		_04_Train.service();
		_05_ElectricCar.service();
		
		
		
		

		
		
		

	}

}
