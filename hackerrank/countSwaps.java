static void countSwaps(List<Integer> a) {
        int n = a.size();
        
        int j, i, temp;
        
        boolean swapped;
        
        int swapCount = 0;
        
        for (i = 0; i < n - 1;i++ ){
            swapped = false; 
            
            for(j = 0; j < n - i - 1; j++){
                if(a.get(j) > a.get(j + 1)){
                    swapCount++;
                    temp = a.get(j);
                    a.set(j , a.get(j+1));
                    a.set(j+1, temp);
                    
                    swapped = true;
                }
            }
            if (swapped == false){
                break;    
            }
            
        }
        
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n -1));
        
        return;
    }
