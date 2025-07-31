public static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> s1Letters = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s1.length(); i++){
            if(s1Letters.containsKey(s1.charAt(i))){
                s1Letters.put(s1.charAt(i), s1Letters.get(s1.charAt(i)) + 1 );
            }else{
                s1Letters.put(s1.charAt(i), 1);
            }
        }
        
        for (int j = 0; j < s2.length(); j++){
            if( s1Letters.containsKey( s2.charAt(j) )  ){
                return "YES";
            }
            // }else{
            //     return "NO";
            // }
        }
        
        return "NO";
    }
