public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, ans, new ArrayList<Integer>(), 0, target);
        return ans;
    }
    public void helper(int[] candidates, List<List<Integer>> ans,  List<Integer> tmp, int begin, int remain){
        if(remain == 0){
            ans.add(new ArrayList<Integer>(tmp));
        }
        else if(remain < 0){
            return;
        }
        else{
            // for(int i = begin; i < candidates.length; i++){
            int i = begin;
            while(i < candidates.length){
                tmp.add(candidates[i]);
                helper(candidates, ans, tmp, i, remain-candidates[i]);
                tmp.remove(tmp.size()-1);
                i++;
            }
        }
    }
}