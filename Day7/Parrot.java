package nest4code;

public class Parrot extends Bird implements FlyBehaviour {
	public void sound() {
		System.out.println("Parrot is screeching");
	}
	public void peck() {
		System.out.println("pecking");
	}
	public void fly() {
		System.out.println("Parrot can fly");
	}

}
