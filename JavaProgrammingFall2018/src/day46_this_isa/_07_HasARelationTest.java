package day46_this_isa;

public class _07_HasARelationTest {
	public static void main(String[] args) {
		
		_06_Engine carEngine = new _06_Engine();
		carEngine.cylinders = 4;
		carEngine.horsepower = 234;
		
		_05_Car car = new _05_Car();
		car.model = "Toyota Camry";
		car.engine = carEngine;
		
		//print
		
		System.out.println(car.model);
		System.out.println(car.engine.cylinders);
		
		_05_Car car2 = new _05_Car();
		car2.model = "BMW";
		car2.engine = new _06_Engine();
		car2.engine.cylinders = 6;
		car.engine.horsepower = 500;
		
		_05_Car car3 = new _05_Car();
		car3.engine = new _06_Engine(8,687);
		car3.model = "Audi";
		
		System.out.println(car3.model + " has " + car3.engine.cylinders + " cylinders");
		System.out.println(car3.model + " has " + car3.engine.horsepower + " horsepower");
		
		
		
	}

}
