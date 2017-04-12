public class Solution {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0) && helper(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }
    public boolean helper(char[][] board, String word, int i, int j, int stringIdx){
        
        if(stringIdx == word.length()) return true;
        if(i == board.length || j == board[0].length || i < 0 || j < 0 ||word.charAt(stringIdx) != board[i][j] || visited[i][j]) return false;
        
        visited[i][j] = true; // visted only for traverse below, set to avoid visiting one element more than once
        if(helper(board, word, i+1, j, stringIdx+1)||
        helper(board, word, i-1, j, stringIdx+1)||
        helper(board, word, i, j+1, stringIdx+1)||
        helper(board, word, i, j-1, stringIdx+1))
        return true;
        visited[i][j] = false;
        
        return false;
    }
}