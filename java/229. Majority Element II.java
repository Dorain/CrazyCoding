public class Solution {
    public List<Integer> majorityElement(int[] nums) {
      // 1. at most 2 majority numbers, 
      //  1).when 2 maj num, then "other" number is less than n/3
      //  2) when 1 maj num, 
      ///        when the second counter equals 0, first conter remain, thus second counter will kill at least n/3 nums
      List<Integer> ans = new ArrayList<Integer>();
      if(nums == null || nums.length == 0) return ans;
      int count1 = 0, count2 = 0, maj1 = 0, maj2 = 0;
      for(int n : nums){
          if(maj1 == n) count1++;
          else if(maj2 == n) count2++;
          // verify count == 0 later, because we have two maj, we need to ensure n != both 
          else if(count1 == 0) {
              maj1 = n;
              count1++;
          }
          else if(count2 == 0) {
              maj2 = n;
              count2++;
          }
          else {
              count1--;
              count2--;
          }
      }
      count1 = count2 = 0;
      for(int n: nums){
          if(n == maj1) count1++;
          else if(n == maj2) count2++;
      }
      if(count1>nums.length/3) ans.add(maj1);
      if(count2>nums.length/3) ans.add(maj2);
      return ans;
    }
}