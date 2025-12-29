class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null && t == null){
            return true;
        }
        int i = 0;
        int j = 0;
        while(j < s.length() && i < t.length()){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
            i++;
        }
        return j == s.length();
    }
}