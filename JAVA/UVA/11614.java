import java.util.*;
import java.io.*;
class UVA11614{
 public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int TC = sc.nextInt(); // number of test cases
    for (int t = 0; t < TC; t++) { // shortcut to repeat until 0
      double n = sc.nextDouble(); // compute answer
      System.out.println((int)((-1+Math.sqrt(1+4*2*n))/2));
    }
  }

}