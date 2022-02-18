import java.util.*;

class Solution {
    public int wordCount(String [] startWords, String [] targetWords){

        ArrayList <String> al = new ArrayList<>();
        int c =0;
        for(int i =0; i<startWords.length;i++){
            char [] t = startWords[i].toCharArray();
            
            Arrays.sort(t);
            String str = new String(t);
            al.add(str);
        }
        

        for(int i=0; i<targetWords.length;i++){

            for (int j=0; j<targetWords[i].length();j++){
                String str = targetWords[i].substring(1,j)+targetWords[i].substring(j,targetWords[i].length());
                char [] t = str.toCharArray(); Arrays.sort(t);
                str = new String(t);
                if(al.contains(str)){
                    c++;
                    break;
                }



            }
        }
   
   
   
    return c;
   
    }


    
}
