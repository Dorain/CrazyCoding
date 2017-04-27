public class Solution {
    public int findNthDigit(int n) {
        // 9 1digt, 99-9=90 2 digit, 999- 99 = 900 3 digit
        int count = 1, digitLen = 9, numStart = 1;
        while(n/count > digitLen ){
            
            n -= digitLen * count;
            digitLen *= 10;
            numStart *= 10;
            count ++;
            // System.out.println(n);

        }
        String tmp = new String(""+ (numStart + (n-1) / count));
        // System.out.println(tmp);
        // System.out.println(n);
        // System.out.println((n-1) % count);
        return tmp.charAt((n-1) % count) - '0';
    }
}