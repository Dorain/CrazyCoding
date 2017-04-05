public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }
//     private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] cand, int remain, int start) {
   
//   if(remain < 0) return; /** no solution */
//   else if(remain == 0) list.add(new ArrayList<>(tempList));
//   else{
//       for (int i = start; i < cand.length; i++) {
//          if(i > start && cand[i] == cand[i-1]) continue; /** skip duplicates */
//          tempList.add(cand[i]);
//          backtrack(list, tempList, cand, remain - cand[i], i+1);
//          tempList.remove(tempList.size() - 1);
//       }
//   }
   private void backtrack(List<List<Integer>> list, List<Integer> tmp, int[] cand, int remain, int start) {
       if(remain < 0) return;
       else if(remain == 0) list.add(new ArrayList<>(tmp));
       else{
           for(int i = start; i < cand.length; i++){
               if(i > start && cand[i] == cand[i-1]) continue;
               tmp.add(cand[i]);
               backtrack(list, tmp, cand, remain - cand[i], i+1);
               tmp.remove(tmp.size() -1);
           }
       }
   }
}