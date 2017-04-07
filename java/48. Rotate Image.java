public class Solution {
    public void rotate(int[][] matrix) {
        // reverse
        for(int i = 0; i < matrix.length/2; i++){
            // !!! dont reverse twice
            int[] tmp = matrix[i];
            matrix[i] = matrix[matrix.length-1-i];
            matrix[matrix.length-1-i] = tmp;
        }
        
        // symmetry
        
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = i; j < matrix[0].length; j++){
                
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}