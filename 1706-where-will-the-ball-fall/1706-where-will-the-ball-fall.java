class Solution {
    public int[] findBall(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        int ans[]=new int[c];
        for(int i=0;i<c;++i){
            ans[i]=getans(0,i,r,c,grid);
        }
        return ans;
    }
    int getans(int r,int c,int limR,int limC,int mat[][]){
        //base mat[i][j] near mat[i][j+1] mat[i-1][j]
        if(c<0 || c>=limC) return -1;
        if(r==limR) return c;
        if(mat[r][c]==1 && c+1 < limC && mat[r][c+1]==1){
            return getans(r+1,c+1,limR,limC,mat);
        }
        if(mat[r][c]==-1 && c-1 >= 0 && mat[r][c-1]==-1){
            return getans(r+1,c-1,limR,limC,mat);
        }
        return -1;
    }
}