public class Solution {
    public boolean canJump(int[] nums) {
        // boolean[] isReachable = new boolean[nums.length];
        // if(nums == null || nums.length == 0) return false;
        // isReachable[nums.length-1] = true;
        // for(int i = nums.length-1; i >= 0; i--){
        //     int jumpLen = nums[i];
        //     while(jumpLen > 0){
        //         if(i+jumpLen >= nums.length-1 || isReachable[i+jumpLen]) {
        //             isReachable[i] = true;
        //             break;
        //         }
        //         jumpLen --;
        //     }
        // }
        // return isReachable[0];

        // int maxLen = 0;
        // for(int i = 0 ; i < nums.length; i++){
        //     if(maxLen < i ) return false;
        //     maxLen = Math.max(maxLen, i+nums[i]);
        // }
        // return true;
	//***focus on step = 0 case, in other situations, it can always jump to the end
        if(nums.length == 1) return true;
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i] == 0){
                int trap = i;
                while(i+nums[i]<=trap){
                    i--;
                    if(i < 0) return false;
                }
                
            }
        }

       return true;
    }
}