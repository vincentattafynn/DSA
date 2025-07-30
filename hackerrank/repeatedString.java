import java.util.*;
import java.math.*;

class Result{
    public static long repeatedString(String s, long n) {
        long div = Math.floorDiv(n,s.length());
        int count = 0; 
        long remainder = n % s.length();
        long answer = 0;
        
        for (int i = 0; i < s.length(); i ++){
            if( s.charAt(i) == 'a' ){
                count ++;
            }
        }
        
        if(remainder != 0){
            for (int j = 0; j < remainder; j++){
               if( s.charAt(j) == 'a' ){
                answer ++;
                } 
            }
        }
        
        answer = answer + (count * div);
        return answer; 
    }
    
    
    public static void main(String[] args){
       long result = Result.repeatedString("aba",10L);
       System.out.println(result);
    }
}
