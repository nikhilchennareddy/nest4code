package nest4code;

public abstract class Bird {
	double length;
	double breadth;
	double weight;
	String color;
	public void eat() {
		System.out.println("eating");
	}
	public void drink() {
		System.out.println("drinking");
	}
    public abstract void sound();
    public abstract void peck();
    
}
