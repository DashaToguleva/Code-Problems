class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> fMap = new HashMap<>();
        
        for(char c : magazine.toCharArray()){
            fMap.put(c, fMap.getOrDefault(c, 0) + 1);
        }

        for(char s : ransomNote.toCharArray()){
            if(!fMap.containsKey(s) || fMap.get(s) <= 0){
                return false;
            }
            fMap.put(s, fMap.get(s) - 1);
        }
        return true;
    }
}