public class Solution {
    public int missingNumber(int[] nums) {
        //xor is both communitive and associative
        int i = 0, xor = 0;
        for(i = 0; i < nums.length; i++){
            xor ^= i ^ nums[i];
        }
        // xor ^ nums.length ^ X = 0, thus xor ^ nums.length = X  X^X = 0
        return xor ^ i;
    }
}