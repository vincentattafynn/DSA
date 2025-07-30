import java.util.*;
import java.math.*;

class Result{
    
    //take note of top left value
    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
        int maxVal = Integer.MIN_VALUE;
        int tempAns; 
        
        for(int r = 0; r < 4; r ++){
            for(int c = 0; c < 4; c ++){
                tempAns = arr.get(r).get(c) + arr.get(r).get(c + 1) + arr.get(r).get(c + 2) + arr.get(r + 1).get(c + 1) + arr.get(r + 2).get(c) + arr.get(r + 2).get(c + 1) + arr.get(r + 2).get(c + 2);
                
                maxVal = Math.max(tempAns, maxVal);
            }
        }
        
        return maxVal;
    }
    
    
    // public static void main(String[] args) {
        
    // }
}
