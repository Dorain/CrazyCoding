public class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(k > 0){
                if(map.containsKey(entry.getKey() + k) 
                // || map.containsKey(entry.getKey() - k)
                // only count once
                ) count++;
            }
            else if(k == 0){
                count += entry.getValue() > 1 ? 1:0;
            }
        }
        return count;
    }
}