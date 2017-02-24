public class Solution {
    public int findDuplicate(int[] nums) {
        // amazing!! 
        //1. n numbers in range[1,n], jump between index and value. if there is duplicate number, it will eventually jump into a circle;
        //2.using two jumper with differnt steps, they will meet in the circle
        int slow = 0, fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}