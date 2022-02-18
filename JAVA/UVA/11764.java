import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int f =1, x=0;
        while(x == T){
            int C = sc.nextInt();
            int h = sc.nextInt();
            int hj =0;
            int lj=0;
            while (x==C){
                int next = sc.nextInt();
                if(next > h) hj++;
                if(next <h) lj++;
                h=next;
            }
            System.out.println("Case"+f+": "+ hj +" " +lj); f++;

        }
    }
    
}
