

//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        return solve(grid);
    }
    static boolean solve(int[][] grid)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(grid[i][j]==0)
                {
                    for(int k=1;k<=9;k++)
                    {
                        if(isvalid(i,j,k,grid))
                        {
                            grid[i][j]=k;
                            
                            if(solve(grid))
                            return true;
                            else
                            grid[i][j]=0;
                        }
                    }
                    
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isvalid(int r,int c,int k,int[][] grid)
    {
        for(int i=0;i<9;i++)
        {
            if(grid[r][i]==k)
            return false;
            if(grid[i][c]==k)
            return false;
            
            if(grid[3*(r/3)+i/3][3*(c/3)+i%3]==k)
            return false;
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            
        }
    }
}
