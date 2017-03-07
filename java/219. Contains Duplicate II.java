public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //or use to save space
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
            
        }
        return false;
    }
}