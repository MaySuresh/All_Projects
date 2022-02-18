import java.util.*;

class main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int list = Integer.parseInt(in);
        boolean flag = false,flag2 = false;
        int w=0,b=0;
        char [][] c = new char[list][];
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<list;i++) c[i]=sc.nextLine().toCharArray();

        flag =true;
        for(int i=0;i<list;i++){
            for(int j =0;j<list;i++){
                if(c[i][j]=='W') w++;
                else b++;}
                flag&=(w==b);

                String row = new String(c[i]);
                if(row.contains("BBB")&& row.contains("WWW")){
                    flag = false;
                } else flag = true;
            
        }
        flag2 = true;
        for(int i = 0;i<list;i++){
            for(int j=0;j<list;j++){
                if(c[j][i]=='W') w++;
                else b++;
            }
            flag2&=(w==b);
            for(int j =0;j<list;j++) sb.append(c[j][i]);

            String col=sb.toString();
            if(col.contains("BBB") && col.contains("WWW")){
                flag2 = false;
            }else flag2 = true;
        }

        if(flag && flag2){System.out.println(1);}
        else System.out.println(0);




    }
    
}
