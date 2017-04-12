public class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        helper(nums, 0, nums.length-1-k);
        helper(nums, nums.length-k, nums.length-1);
        helper(nums, 0, nums.length-1);
    }
//         k %= nums.length;
//     helper(nums, 0, nums.length - 1);
//     helper(nums, 0, k - 1);
//     helper(nums, k, nums.length - 1);
// }

    public void helper(int[] nums, int begin, int end){
        while(begin < end){
            int tmp = nums[begin];
            nums[begin] =nums[end];
            nums[end] = tmp;
            end--;
            begin++;
        }
    }
}