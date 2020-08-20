package nest4code;
import java.util.Scanner;
public class HalfDiamond_StarPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter maximum number of stars: ");
		int max_stars = scan.nextInt();
		for(int i=0;i<max_stars;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=(max_stars-1);i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
