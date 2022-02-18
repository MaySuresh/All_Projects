import java.util.*;
import java.io.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int [] y = new int[x];

        for(int i=0; i<x; i++){y[i]=sc.nextInt();}

                
        int r =-1;
        int ans =-1;

        for(int i =0; i<x-2;i++){
            int days = Math.max(y[i], y[i+2]);
            if(r ==-1 || days<ans){r=i+1; ans = days;}

        }
        System.out.println(r+ " "+ans);


        
    }
    
}