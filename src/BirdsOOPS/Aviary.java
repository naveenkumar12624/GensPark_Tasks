package BirdsOOPS;
// A class that uses polymorphism
public class Aviary {

	public void performDailyRoutine(Creature creature) {
		if (creature instanceof CanEat){
			((CanEat)creature).eat();
		}
		if (creature instanceof CanFly){
			((CanFly)creature).fly();
		}
		if (creature instanceof CanSpeak){
			((CanSpeak) creature).speak();
		}
	}
}
