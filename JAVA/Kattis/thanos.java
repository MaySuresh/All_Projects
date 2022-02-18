import java.util.*;
import java.io.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            double P = sc.nextDouble(), R = sc.nextDouble(), F = sc.nextDouble();
            int y=0;
            while(P<=F){
                P*=R;
                y++;
            }
            System.out.println(y);
        }
    }
    
}