class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        
        // Iterate through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the current cell matches the first character of the word, try to find the word starting from this cell
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0))
                    return true;
            }
        }
        
        // If the word is not found after iterating through all cells, return false
        return false;
    }
    
    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        // If we have matched all characters of the word, return true
        if (index == word.length())
            return true;
        
        // If we are out of bounds or the current cell does not match the character at the current index of the word, return false
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index))
            return false;
        
        // Mark the current cell as visited by changing its value to a special character
        char temp = board[i][j];
        board[i][j] = '#';
        
        // Explore adjacent cells in all four directions
        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1);
        
        // Restore the original value of the current cell
        board[i][j] = temp;
        
        return found;
    }
}
