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
	public String eat(String e) {
		return e;
	}
    public abstract void sound();
    public abstract void peck();
    
}
