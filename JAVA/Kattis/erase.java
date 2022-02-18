import java.util.*;
import java.io.*;

class main {
    public static void main(String[] args) throws IOException
    {
        Scanner it = new Scanner(System.in);
        int N = it.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();   
        StringBuilder myString = new StringBuilder(first);

        boolean flag = false;
        int x=0;
        while (x<N){
            for (int i = 0; i <first.length(); i++) {
                if(first.charAt(i)=='0')
                {myString.setCharAt(i,'1');
                    
                }else myString.setCharAt(i,'0');
        }
        
       x++;
        
    } 
    for (int i =0; i<myString.length();i++){
            if(myString.charAt(i)==second.charAt(i)) flag = false;
            else flag = true;
        }
        if(flag) System.out.println("Deletion failed");
        else System.out.println("Deletion succeeded");

        }
    
}