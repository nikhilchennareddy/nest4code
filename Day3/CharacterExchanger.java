package nest4code;
import java.util.Scanner;
public class CharacterExchanger {

	public static void main(String[] args) {
	    Scanner word1 = new Scanner(System.in);
	    System.out.print("Enter word1: ");
	    String word_1 = word1.next();
	    Scanner word2 = new Scanner(System.in);
	    System.out.print("Enter word2: ");
	    String word_2 = word2.next();
	    String word__1 = new String(word_1);
	    word_1 = word_2.substring(word_2.length()-2,word_2.length()) + word_1.substring(2,word_1.length()-2) + word_2.substring(0,2);
	    word_2 = word__1.substring(word__1.length()-2,word__1.length()) + word_2.substring(2,word_2.length()-2) + word__1.substring(0,2);	 
	    System.out.println(word_1);
	    System.out.println(word_2);
	    
	    

	}

}
