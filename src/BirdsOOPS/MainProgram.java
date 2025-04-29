package BirdsOOPS;

public class MainProgram {
	public static void main(String[] args) {

		// Create a Parrot
		Parrot parrot = new Parrot();
		parrot.setSpeciesName("Green Parrot");
		parrot.setSkinColor("Green");
		parrot.setMass(1);
		parrot.eat();
		parrot.fly();
		parrot.speak();

		// Create a Dove and i am assign flight behavior
		Dove dove = new Dove();
		dove.setSpeciesName("White Dove");
		dove.setSkinColor("White");
		dove.setMass(2);
		dove.setFlightMode(new FlapAndGlide());
		dove.fly();

		// Create a Whale
		Whale whale = new Whale();
		whale.setSpeciesName("Blue Whale");
		whale.setSkinColor("Blue");
		whale.setMass(30000);
		whale.eat();
		whale.speak();

		// Use Aviary to demonstrate polymorphism
		Aviary aviary = new Aviary();
		aviary.performDailyRoutine(parrot);
		aviary.performDailyRoutine(dove);
		aviary.performDailyRoutine(whale);
	}
}

