public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // sum(0, j) - sum(0, i) = continuos subarray sum(i, j)
        if(nums == null || nums.length == 0) return false;
        int tmpSum = 0;
        int zeroFlag = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for(int i = 0; i < nums.length; i++){
            if(k != 0) {
                tmpSum =  (tmpSum+nums[i]) % k;
                if(!set.add(tmpSum) && i != 0) return true; // the first number may be mutiple k
            }
            else{
                zeroFlag += nums[i] == 0 ? 1:-1; // continuous 0
                if(zeroFlag > 1) return true;
            }
        }
        return false;
    }
}