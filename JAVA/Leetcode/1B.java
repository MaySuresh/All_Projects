import java.util.*;

class main {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder();
        ArrayList<String> lts= new ArrayList<>();
        int i=0,r;
        int len = s.length,s=lts.size();
        while (i+k <len){
            lts.add(s.substring(i,i+k)); i = i+k;
        }
        if(i<len){
            r =k-(len);
            for(int j=0; j<r;j++) sb.append(fill);

            String first = sb.toString();

            String last = s.substring(i,len)+first;


            lts.add(last);

        }

        return lts.toArray(new String [s]);

    }    
}
