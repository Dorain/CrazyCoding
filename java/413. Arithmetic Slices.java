public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A == null || A.length < 3) return 0;
     // k length arithmetic sequence has (k-2) + (k-3) ...+1 slices   
        int currentSum = 0, ans = 0;
        int diff = A[1]-A[0], len = 0;
        
        for(int i = 2; i < A.length; i++){
            if(A[i] - A[i-1] != diff){
             diff = A[i] - A[i-1];
             len = 0;
             ans += currentSum;
             currentSum = 0;
            } 
            else{
             len++;
             currentSum += len;
            }
        }
        ans += currentSum; // when the last element is arith sequence
        return ans;
    }
}