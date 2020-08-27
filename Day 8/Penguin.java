package nest4code;

public class Penguin extends Bird implements SwimBehaviour {
	public void sound() {
		System.out.println("Penguin is honking");
	}
	public void peck() {
		System.out.println("cannot peck");
	}
	public void eat() {
		System.out.println("Penguin is eating");
	}
	public void swim() {
		System.out.println("Penguin can Swim");
	}
	

}
