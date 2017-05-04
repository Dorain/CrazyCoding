public class Solution {
    public String complexNumberMultiply(String a, String b) {
        String ans = new String();
        if(a == null || b == null || a.length() == 0 || b.length() == 0) return ans;
        // int numRa = 0, numIa = 0, signNa = 1, signIa = 1;
        // int numRb = 0, numIb = 0, signNb = 1, signIb = 1;
        // int index = 0;
        // if(a.charAt(index) == '+' || a.charAt(index) == '-')
        //     signNa = a.charAt(index++) == '+' ? 1 : -1;
        // while(index < a.length()) {
        //     if(a.charAt(index) == '+') break;
        //     numRa = numsRa*10 + a.charAt(index++) - '0;'
        // }
        // index++;
        // if(a.charAt(index) == '+' || a.charAt(index) == '-')
        //     signNa = a.charAt(index++) == '+' ? 1 : -1;
            
        // 
        int[] vala = string2Int(a);
        int[] valb = string2Int(b);
        int realN = vala[0]*valb[0] - vala[1]*valb[1];
        int imagN = vala[0]*valb[1] + vala[1]*valb[0];
        return realN + "+" + imagN + "i";
    }
    public int[] string2Int(String a){
        String[] s = a.split("[+i]"); // double backslash in java for regex, [^abc] match all but abc, [abc] match abc
        int[] val = {Integer.valueOf(s[0]), Integer.valueOf(s[1])};
        return val;
    }
}