public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1, post = 1;
        int[] rs = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            rs[i]= pre;
            pre *= nums[i];
        }
        for(int j = nums.length-1; j>=0; j--){
            rs[j] = rs[j]*post;
            post *= nums[j];
        }
        return rs;
    }
}