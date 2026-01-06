class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, Integer> mapP = new HashMap<>();
        HashMap<String, Integer> mapS = new HashMap<>();

        String [] ns = s.split(" ");
        if(pattern.length() != ns.length){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            if(!mapP.containsKey(pattern.charAt(i))){
                mapP.put(pattern.charAt(i), i);
            }

            if(!mapS.containsKey(ns[i])){
                mapS.put(ns[i], i);
            }

            if(!mapP.get(pattern.charAt(i)).equals(mapS.get(ns[i]))){
                return false;
            }
        }
        return true;
    }
}