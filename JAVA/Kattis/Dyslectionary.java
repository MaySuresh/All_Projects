import java.util.*;
import java .io.*;
class main {

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String w;
        boolean flag = false, loop =true;

      while(sc.hasNextLine()){
            int m=0,s;
            ArrayList<String> list = new ArrayList<>();
            while(true){ w = sc.nextLine();
                if(!sc.hasNext()) flag = true;
                if(list.isEmpty()) break;

                if(w.length()>m) m = w.length();
                else if (w.length()<m) m=m;
                list.add(w);

                if(flag) break;
            }

            for(int i =0;i<list.size();i++){
                w =list.get(i);
                s = m-w.length();

                for(int j=0;j<s;j++) w = " "+w;
                list.set(i, w);

            }
            Collections.sort(list, (String w1, String w2)-> {
                for (int i = w1.length() - 1; i >= 0; i--) {
                    if (w1.charAt(i) != w2.charAt(i)) {
                        return w1.charAt(i) - w2.charAt(i);
                    }
                }

                return 0;
            });

            for(String i:list) System.out.println(i);

            if(!flag) System.out.println();

        }




    }
    
}
