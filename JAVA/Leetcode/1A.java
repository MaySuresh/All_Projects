import java.util.*;

class Solution {
    public boolean checkValid(int[][] matrix){
        for(int i=0; i<matrix.length;i++){
            ArrayList<Integer> al = new ArrayList<>();
            for (int j=0;j<matrix.length; j++){
                
                al.add(matrix[i][j]);}
        }
        for(int i = 0; i<matrix.length;i++){
            ArrayList<Integer> al = new ArrayList<>();
            for (int j =0; j<matrix.length;j++){al.add(matrix[j][i]);}
        
        if (al.size()<matrix.length){return true;}

            }
        
        return false;
        
    }
            
}