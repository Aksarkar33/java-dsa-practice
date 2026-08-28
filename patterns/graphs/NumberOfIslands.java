package patterns.graphs;

public class NumberOfIslands {
    static int row,cols;

    static int numIslands(char[][] grid){
        if (grid==null || grid.length ==0) return 0;

        row =grid.length;
        cols=grid[0].length;
        int count =0;

        for(int r=0;r<row;r++){
            for(int c=0;c<cols;c++){
                if (grid[r][c]=='1') {
                    count++;
                    dfs(grid,r,c);
                }
            }
        }
        return count;
    }
    static void dfs(char[][] grid,int r,int c){

        if (r<0 ||c<0 || r>=row || c>=cols || grid[r][c]=='0') {
            return;
        }

        grid[r][c]='0';

        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
        dfs(grid, r, c-1);
        dfs(grid, r, c+1);
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        System.out.println("Islands: "+ numIslands(grid));
    }

}
