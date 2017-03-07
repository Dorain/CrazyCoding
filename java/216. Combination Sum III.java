public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        // backward
        List<List<Integer>> rs = new ArrayList<List<Integer>>();
        helper(rs,new ArrayList<Integer>(),k,n,1);
        return rs;
    }
    public void helper(List<List<Integer>> rs, List<Integer> list, int k, int n, int start){
        if(n==0 && k == 0){
            rs.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = start; i<=9; i++){
            list.add(i);
            helper(rs, list, k-1, n-i, i+1);
            list.remove(list.size()-1);
        }
    }
}