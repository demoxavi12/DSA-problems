class Solution {
    public boolean closed(int [][]grid,int i,int j){
        int n=grid.length;
        int m=grid[0].length;
        if(i<0 || i>=n || j<0 || j>=m){
            return false;
        }
        if(grid[i][j]==1){
            return true;
        }
        grid[i][j]=1;
        return closed(grid,i+1,j) & closed(grid,i-1,j) & closed(grid,i,j+1) & closed(grid,i,j-1);
    }
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0 && closed(grid,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
}