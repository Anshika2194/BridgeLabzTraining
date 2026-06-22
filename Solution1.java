import java.util.*;
public class Solution1 {
    private int n, m;
    private int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int ans = 0;
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    ans++;
                }
            }
        }
 
        return ans;
        
    }
    private void dfs(char[][] grid, int x, int y) {
        grid[x][y] = '-'; 
 
        for (int[] dir : directions) {
            int x_ = x + dir[0];
            int y_ = y + dir[1];
 
            if (isSafe(x_, y_,grid)) {
                dfs(grid, x_, y_);
            }
        }
    }
    private boolean isSafe(int x,int y,char[][]grid){
        if(x<0||y<0||x>=grid.length||y>=grid[0].length){
            return false;
        }
        if(grid[x][y]=='0'){
            return false;
        }
         if(grid[x][y]=='-'){
            return false;
        }
        return true;
    }
}