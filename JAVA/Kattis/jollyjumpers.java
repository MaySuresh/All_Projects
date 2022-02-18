import java.io.*;
import java.util.*;

class main {

public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input = "";
    while ((input = reader.readLine()) != null && !input.trim().equals("\n") && !input.trim().equals(""))
    {
        String[] data = input.split("\\s+");
        int TC = Integer.parseInt(data[0]);
        boolean flag = true;
        BitSet bitSet = new BitSet(TC);

        for(int i = 1; i< data.length-1; i++)
        {
            int d = Math.abs(Integer.parseInt(data[i]) - Integer.parseInt(data[i+1]));
            if (d < 1 || d >= TC || bitSet.get(d))
            {
                System.out.println("Not Jolly");
                flag = false;
                break;
            }
            bitSet.set(d);
        }
        if(flag)
        {
            System.out.println("Jolly");
        }
    }
}
}