public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // count the frequency of letters 
        // time space O(n)
        int[] alph = new int[26];
        for(char s: magazine.toCharArray()){
            alph[s - 'a'] ++;
        }
        for(char t: ransomNote.toCharArray()){
            alph[t - 'a'] --;
            if(alph[t - 'a'] < 0) return false;
        }
        return true;
    }
}