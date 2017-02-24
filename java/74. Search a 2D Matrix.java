public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // start from top left
        if(matrix == null || matrix.length == 0|| matrix[0].length == 0 ) return false;
        int i = 0;
        for(i = 0; i < matrix.length; i++){
            if(matrix[i][0] == target) return true;
            if(matrix[i][0] > target) break;
        }
        if(i == 0 ) return false;
        return myBS(matrix[i-1], target);
    }
    public boolean myBS(int[] matrix, int target){
        int lo = 0, hi = matrix.length -1;
        while(lo < hi){
            int mid = lo + (hi-lo)/2;
            if(matrix[mid] == target) return true;
            if(matrix[mid] < target){
                lo = mid + 1;
            }else{
                hi = mid;
            }
        }
    
        if(matrix[lo] == target)  return true;
        return false;
    }
}