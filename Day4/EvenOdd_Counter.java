package nest4code;
import java.util.Scanner;
public class EvenOdd_Counter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter num:");
		long num = scan.nextLong();
		String num_str = String.valueOf(num);
		int len = num_str.length();
		int count1 = 0;
		int count2 = 0;
		//System.out.println(len);
		int i;
		for(i = 0; i < len; i++){						
		    long digit = num % 10;
		    if (digit % 2 == 0) {
		        count1 = count1 + 1;
		    }else{
		        count2 = count2 + 1;
		      }
		    num = num / 10;
		    //System.out.println(num);
		    }
		System.out.println("odd digits:"+count2);
		if (num > 0){
		    System.out.println("even digits:"+count1);
		}else{			
		    System.out.println("even digits:"+(count1-1));
		}

	

	}

}
