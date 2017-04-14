public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans, new ArrayList<Integer>());
        return ans;
    }
    public void helper(int[] nums, int begin, List<List<Integer>> ans,List<Integer> tmp){
        ans.add(new ArrayList<Integer>(tmp));
        for(int i =begin; i<nums.length; i++){
            tmp.add(nums[i]);
            helper(nums, i+1, ans, tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}