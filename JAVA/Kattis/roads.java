
import java.util.*;

class roads { static int [] s;
    public static int ret(int x){
        return s[x]==x ? x:(s[x]=ret(s[x]));
        }
    public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    
    int c = sc.nextInt();
    while(c-2>0){
        int n= sc.nextInt();
        s=new int[n];
        for(int i=0;i<s.length;i++) s[i]=i;

        int r = sc.nextInt();

        while(r-2>0){
            s[ret[sc.nextInt()]]

        }

    }

    }

    
}
