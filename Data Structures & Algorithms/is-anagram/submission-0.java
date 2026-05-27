class Solution {
    public boolean isAnagram(String s, String t) {
           if(s.length()!= t.length()) return false;

           int[] charCounts = new int[26];
           for(int i = 0; i < s.length();i++){
            char charS = s.charAt(i);
            int indexS = charS-'a';

            charCounts[indexS]++;

            int indexT = t.charAt(i)-'a';
            charCounts[indexT]--;

           }
           for(int count : charCounts){
            if(count !=0) return false;
           }
           return true;
    }
}
