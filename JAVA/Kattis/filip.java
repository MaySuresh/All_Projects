import java.util.*;
import java.io.*;

class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int f=0;
        int s=0;
        while (a !=0){
            int hold= hold - a % 10;
            f=f*10+hold;
            a/=10;

            int h2 = h2- b % 10;
            s=s*10+h2;
            b/=10;


        }
        if(f>s) System.out.println(f);
        else System.out.println(s);
      
    }
    
}