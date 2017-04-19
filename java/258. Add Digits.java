public class Solution {
    public int addDigits(int num) {
        // 10^k mod 9 = 1, thus a*10^k mod 9 = a*1 mod 9. 100a + 10b + c mod 9 = a+b+c mod 9= one digit mod 9
        return (num-1) % 9 + 1; // consider 9 
    }
}