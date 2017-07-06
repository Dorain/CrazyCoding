public class Solution {
    public boolean isStrobogrammatic(String num) {
        // use switch. four pairs (00)(88)(11)(69)
        // amazing solution below
        for(int i = 0, j = num.length()-1; i<=j; i++,j--){
            if(!"00 11 969 88".contains("" + num.charAt(i) + num.charAt(j))) return false;
        }
        return true;
    }
}
