public static int countingValleys(int steps, String path){
        HashMap<Character, Integer> dict = new HashMap <Character, Integer>();
        dict.put('D',-1);
        dict.put('U', 1);
        
        int currentAltitude = 0;
        int valleyCount = 0;
        int nextStep;
        
        for(int i = 0; i < steps; i++){
            nextStep = dict.get( path.charAt(i) );
            
            if (currentAltitude == 0 && nextStep < 0 ){
                valleyCount++;
            }
            
            currentAltitude += nextStep;
        }
        
        
        return valleyCount;
        
    }
