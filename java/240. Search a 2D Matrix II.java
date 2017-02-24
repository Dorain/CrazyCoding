public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int i = 0, j = matrix[0].length;
        for( i = 0; i < matrix.length; i++){
            int idx = myBS(matrix[i], j, target);
            j = idx;
            if(j == matrix[0].length) continue;
            if(matrix[i][idx] == target) return true;
            
        }
        return false;
    }
    public int myBS(int[] matrix, int j, int target){
        int lo = 0, hi = j - 1;
        while(lo < hi){
            int mid = lo + (hi-lo)/2;
            if(matrix[mid] == target){
                return mid;
            }
            if(matrix[mid] < target){
                lo = mid + 1;
            }
            else{
                hi = mid;
            }
        }
        if(matrix[lo] < target) return lo+1;
        return lo;
    }
}