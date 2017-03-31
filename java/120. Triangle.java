// break the original triangle, space O(1)
// keep, space O(n)
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // List<Integer> minTrian = new ArrayList<Integer>(triangle.get();
        int[] minT = new int[triangle.size()+1];
        for(int i = triangle.size()-1; i >=0; i--){
            for(int j = 0; j < triangle.get(i).size(); j++){
                // value i be useless after ith operation
                minT[j] = Math.min(minT[j], minT[j+1])+triangle.get(i).get(j);
            }
        }
        return minT[0];
    }
}