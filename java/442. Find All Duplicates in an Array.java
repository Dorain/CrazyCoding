public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> rs = new ArrayList<Integer>();
        for(int i = 0; i <nums.length; i++){
            int tmp = Math.abs(nums[i])-1;
            if(nums[tmp]<0) rs.add(Math.abs(nums[i]));
            else nums[tmp] = -nums[tmp];
        }
        return rs;
    }
}