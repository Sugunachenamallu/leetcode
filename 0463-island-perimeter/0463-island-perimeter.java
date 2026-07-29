class Solution {
    public int islandPerimeter(int[][] grid) {
     int island=0;
     int neighbours=0;
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
                island++;

            
            if(j<grid[0].length-1 && grid[i][j+1]==1){
                neighbours++;
            }
            if(i<grid.length-1 && grid[i+1][j]==1){
                neighbours++;
            }
         }
        }
     }
     return island*4-neighbours*2;

        
    }
}