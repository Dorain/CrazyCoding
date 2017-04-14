public class Solution {
    public void sortColors(int[] nums) {
        int n0 = 0, n1 = 0, n2 = 0;
        for(int n: nums){
            if(n == 2){
                nums[n2++] = 2;
            }
            else if(n == 1){
                nums[n2++] = 2;
                nums[n1++] = 1;
            }
            else{
                nums[n2++] = 2;
                nums[n1++] = 1;
                nums[n0++] = 0;
            }
        }
    }

}