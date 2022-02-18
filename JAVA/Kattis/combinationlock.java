import java.util.*;
//import java.io.*;

class main {
    static int distance(int x, int y){
        int s = 0;
        for (int i = x; i !=y;s++) i=(i+1)%40 ;
        return s*9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = 1080;
            int sum = 0;
            int [] num =  new int[4];
            for (int i =0;i <4;i++){
                num[i] = sc.nextInt();
                sum = sum +num[i];
            }if (sum==0)break;
            a = a+distance(num[1], num[0]);
            a = a+distance(num[1], num[2] );
            a =a+distance(num[3], num[2]);
            System.out.println(a);
            }
        
    }
    
}