public static void checkMagazine(List<String> magazine, List<String> note) {
        if (note.size() > magazine/size()){
            System.out.println("No");
            return;
        }
        
        HashMap<String, Integer> magazineWords = new HashMap<String, Integer>();
        
        for(String word: magazine){
            magazineWords.put(word, magazineWords.getOrDefault(word, 0) + 1);
        }
        
        for (String noteWord: note){
            if(magazineWords.containsKey( noteWord ) && magazineWords.get(noteWord) > 0){
                magazineWords.put(noteWord, magazineWords.get(noteWord) - 1);
            }else{
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
        return;

    }
