package zooStore;


public class ZooStore {
	
	static Animal[] animalList = new Animal[3];
	
	public static void main(String[] args) {
		
	
	
	Animal dog = new Animal();
	dog.setName("Bethovin");
	dog.setWeight(120);
	dog.setColor("Pink");
	
	Animal cat = new Animal();
	cat.setName("Pasha");
	cat.setWeight(150);
	cat.setColor("Orange");
	
	Animal horse = new Animal();
	horse.setName("BigFoot");
	horse.setWeight(300);
	horse.setColor("Rainbow");
	
	
	// from animalist print animal name who's color starts with "r";
	
	for (int i = 0; i < animalList.length; i++) {
		if (animalList[i].getColor().toLowerCase().startsWith("r")) {
			System.out.println(animalList[i].getName());
		}
	}
	
	
	}
}
