package nest4code;
import java.util.Scanner;

public class HeightAndWeightConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner feet = new Scanner(System.in);
		System.out.print("enter feet ");
		float f = feet.nextFloat();
		Scanner inch = new Scanner(System.in);
		System.out.print("enter inches ");
		float i = inch.nextFloat();
		Scanner w_kg = new Scanner(System.in);
		System.out.print("enter weight in kg ");
		float w = w_kg.nextFloat();
		float height = heightConverter(f,i);
		System.out.println("height in centimeter is "+height);
		float weight = weightConverter(w);
		System.out.println("weight in pounds is "+ weight);
		
		

	}
	static float heightConverter(float feet,float inch) {
		float h_cm = (float)((feet*12*2.54) + (inch*2.54));
		return h_cm;
	}
	static float weightConverter(float w_kg) {
		float w_pounds = (float)(w_kg*2.2);
		return w_pounds;		
	}

}
