public class Solution {
    public void wiggleSort(int[] nums) {
        if(nums == null) return;
        for(int i = 1; i < nums.length; i++){
            if((i%2 == 1) == (nums[i] < nums[i-1]) ) swap(nums, i-1, i);
            // amazing operation! use == when two condition must be meet at the same time
        }
    }
    public void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
