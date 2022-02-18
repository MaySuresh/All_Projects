import java.util.*;
import java.io.*;
public class leftbeehind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(a ==0 && b==0) {break;}
			else if(a+b==13) {System.out.println("Never speak again.");}
			else if (a==b) {System.out.println("Undecided.");}
			else if(a > b ) {System.out.println("To the convention.");}
			else if(a<b) {System.out.println("Left beehind.");}
			
			
			
		}
		
	}

}
