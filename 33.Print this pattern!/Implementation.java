class Solution{
    void printPattern(int N){
        // code here
        // distance is like 00000
        //                  01110
        //                  01210
        //                  02220
        //                  00000
        //  its like the min distance to get to the borders
        //  the top bottom left right
        //  int up->row-0
        //  int left->col-0
        //  int down->total rows-row
        //  int right->total col-col
        //  we have to take the minimum of all these distances
        
        int row=2*N-1;
        int col=2*N-1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int up=i-0;
                int left=j-0;
                int down=2*N-2-i;
                int right=2*N-2-j;
                int r=Math.min(Math.min(up,left),Math.min(down,right));
                System.out.print(N-r);
            }
            System.out.println();
        }
    }
}
