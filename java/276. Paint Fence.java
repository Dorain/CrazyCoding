public class Solution {
    public int numWays(int n, int k) {
        // no 3 adjacent fence have the same color
        // when paint fence i, if(i-2 == i-1) count(i-2)*(k-1); if(i-2 != i-1) count(i-2)*(k-1)*(k)
        int count1 = k, count2 = k*k, count3 = 0;
        if(n == 1) return count1;
        if(n == 2) return count2;
        for(int i = 3; i <= n; i++){
            count3 = count1*(k-1) + count2*(k-1);
            count1 = count2;
            count2 = count3;
        }
        return count3;
    }
}
