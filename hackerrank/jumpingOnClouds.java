import java.util.*;
import java.math.*;

class Result{
    public static int jumpingOnClouds(List<Integer> c){
        int jumps = 0;
        int i = 0;
        
        while( i < c.size() ){
            if ( i == c.size() - 1){
                return jumps;
            }else if( i + 2 < c.size() && c.get(i + 2) != 1  ){
                jumps++;
                i += 2;
            }else if( i + 1 < c.size() && c.get(i + 1) != 1 ){
                jumps++;
                i += 1;
            }
        }
        
        return jumps;
    }
    
    public static void main(String[] args){
        // List<Integer> arrayList = new ArrayList<Integer>();
        // arrayList.add(0);
        // arrayList.add(1);
        // arrayList.add(0);
        // arrayList.add(0);
        // arrayList.add(0);
        // arrayList.add(1);
        // arrayList.add(0);
        
        List<Integer> arrayList = Arrays.asList(0,1,0,0,0,1,0);
        
       int result = Result.jumpingOnClouds(arrayList);
       System.out.println(result);
    }
}
