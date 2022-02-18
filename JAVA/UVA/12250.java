import java.util.*;
import java.io.*;

class UVA12250 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (true) {
          String s = sc.nextLine(); 
          if (s.compareTo("#") == 0) break;
          if (s.compareTo("HELLO") == 0) System.out.println("Case " + i + ": ENGLISH");
          else if (s.compareTo("HOLA") == 0) System.out.println("Case " + i + ": SPANISH");  
          else if (s.compareTo("HALLO") == 0) System.out.println("Case " + i + ": GERMAN");
          else if (s.compareTo("BONJOUR") == 0) System.out.println("Case " + i + ": FRENCH");
          else if (s.compareTo("CIAO") == 0) System.out.println("Case " + i + ": ITALIAN");
          else if (s.compareTo("ZDRAVSTVUJTE") == 0) System.out.println("Case " + i + ": RUSSIAN");
          else System.out.println("Case " + i + ": UNKNOWN");
          i++;
        }
      }
}
