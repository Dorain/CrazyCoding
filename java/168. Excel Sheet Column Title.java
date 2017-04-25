public class Solution {
    public String convertToTitle(int n) {
        StringBuilder ans = new StringBuilder();
        if(n == 0) return "";
        while(n > 0){
            ans.append((char) ('A' + (n-1)%26 ) );
            // difference between  n%26 -1 and (n-1)%26
            n = (n-1) /26;
        }
        return ans.reverse().toString();
    }
}