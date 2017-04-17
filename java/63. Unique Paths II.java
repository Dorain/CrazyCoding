public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] path = new int[m][n];
        int flag = 0;
        for(int i = 0; i < m; i++){
            if(obstacleGrid[i][0] == 1) {
                flag = 1;
            }
            if(flag == 0){
                path[i][0] = 1;
            }
        }
        flag = 0;
        for(int j = 0; j < n; j++){
           if(obstacleGrid[0][j] == 1) flag = 1;
            if(flag == 0) path[0][j] = 1;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1) path[i][j] = 0;
                else{
                    path[i][j] = path[i-1][j] + path[i][j-1];
                }
            }
        }
        return path[m-1][n-1];
    }
}