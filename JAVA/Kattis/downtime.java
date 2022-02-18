import java.util.*;

class main {
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[100000];
        int N = sc.nextInt();
        int K = sc.nextInt();
        int t=0;
        double total=0;
         

        while (N>0){
            t = sc.nextInt(); 
            
            a[t+1000]--;
            a[t]++;
            N--;
        }
        for(int i=0;i<a.length;i++) total = Math.max(total, a[i]+=a[i-1]);
    System.out.println(total/K);        
    }
    
}
