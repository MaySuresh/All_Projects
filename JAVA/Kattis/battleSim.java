import java.util.*;
import java.io.*;

class main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String out ="";
        StringBuilder sb = new StringBuilder(out);
        for (int i=0; i <input.length();i++){
            if(input.contains("RBL") || input.contains("BRL")||input.contains("LBR")||input.contains("RLB ")||input.contains("BLR ")||input.contains("LRB ")) sb.insert(i,'C');
            else if(input.charAt(i)=='R') sb.insert(i,'S');
            else if (input.charAt(i)=='B') sb.insert(i,'K');
            else if (input.charAt(i)=='L')sb.insert(i,'H');

        }
        System.out.println(sb);
    }

}