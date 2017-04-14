public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        if(n ==0) return ans;

        int rowB = 0, colB = 0, rowE = n-1, colE = n-1;
        int num = 1;
        ans[0][0] = 1;
        // <= because of the element in the middle
	while(rowB<=rowE || colB<=colE){
            
            for(int i = colB; i<=colE; i++){
                ans[rowB][i] = num++;
            }
            rowB++;
            for(int i = rowB; i<= rowE; i++){
                ans[i][colE] = num++;
            }
            colE--;
            for(int i = colE; i>= colB ; i--){
                ans[rowE][i] = num++;
            }
            rowE--;
            for(int i = rowE; i>= rowB; i--){
                ans[i][colB] = num++;
            }
            colB++;
        }
        return ans;
    }
}