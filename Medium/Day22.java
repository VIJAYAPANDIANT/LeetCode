/*289. Game of Life 
According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state of the board is determined by applying the above rules simultaneously to every cell in the current state of the m x n grid board. In this process, births and deaths occur simultaneously.

Given the current state of the board, update the board to reflect its next state.

Note that you do not need to return anything.

 

Example 1:


Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
Example 2:


Input: board = [[1,1],[1,0]]
Output: [[1,1],[1,1]]*/
/*class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[] dirs = {-1, 0, 1};

        // First pass: mark transitions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;

                for (int dx : dirs) {
                    for (int dy : dirs) {
                        if (dx == 0 && dy == 0) continue;
                        int x = i + dx;
                        int y = j + dy;

                        if (x >= 0 && x < m && y >= 0 && y < n &&
                            (board[x][y] == 1 || board[x][y] == 2)) {
                            liveNeighbors++;
                        }
                    }
                }

                // Rule application
                if (board[i][j] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        board[i][j] = 2; // live → dead
                    }
                } else {
                    if (liveNeighbors == 3) {
                        board[i][j] = 3; // dead → live
                    }
                }
            }
        }

        // Second pass: finalize states
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) board[i][j] = 0;
                if (board[i][j] == 3) board[i][j] = 1;
            }
        }
    }
}
 */
/*class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[] dir = {-1, 0, 1};

        // Step 1: Mark transitions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int live = 0;

                for (int x : dir) {
                    for (int y : dir) {
                        if (x == 0 && y == 0) continue;
                        int r = i + x;
                        int c = j + y;

                        if (r >= 0 && r < m && c >= 0 && c < n &&
                           (board[r][c] == 1 || board[r][c] == 2)) {
                            live++;
                        }
                    }
                }

                if (board[i][j] == 1 && (live < 2 || live > 3))
                    board[i][j] = 2; // live → dead
                else if (board[i][j] == 0 && live == 3)
                    board[i][j] = 3; // dead → live
            }
        }

        // Step 2: Finalize board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] %= 2;
            }
        }
    }
}
 */
/*⏱ Complexity

Time: O(m × n)

Space: O(1) */