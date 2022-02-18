import java.util.*;

class pot {
    public static void main(String [] args){
        Scanner  sc = new Scanner(System.in);
       int fin=0;
       
        int N = sc.nextInt();
        
        
        for(int i=0;i<N;i++){
            int inp = sc.nextInt();
            int last = inp%10;
            int first = inp/10;
            fin+= Math.pow(first, last);
        }
        System.out.println(fin);



    }
}
