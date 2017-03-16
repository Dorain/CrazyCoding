public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> rs = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            int tmp = Math.abs(nums[i])-1;
            nums[tmp] = -Math.abs(nums[tmp]);
        }
        for(int i = 0; i< nums.length; i++){
            if(nums[i]>0) rs.add(i+1);
        }
        return rs;
    }
}