class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 1){
            return s.length();
        }
        String[] arr = s.split(" ");
        int i = arr.length - 1;
        while(arr[i] == " "){
            i--;
        }
        return arr[i].length();
    }
}