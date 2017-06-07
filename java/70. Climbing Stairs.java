public class Solution {
    public int climbStairs(int n) {
        int[] step = new int[n+1];
	step[0] = step[1] = 1;
	for(int i = 2; i <= n; i++){
		step[i] = step[i-2] + step[i-1];
	}
	return step[n];
    }
}