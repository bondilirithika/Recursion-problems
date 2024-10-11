
class Solution
{
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code hereint kx
        int kx=KnightPos[0]-1;
        int ky=KnightPos[1]-1;
        int tx=TargetPos[0]-1;
        int ty=TargetPos[1]-1;
        int[] r={1,-1,-2,-2,-1,1,2,2};
        int[] c={2,2,1,-1,-2,-2,-1,1};
        int count=0;
        Queue<pair> q=new LinkedList<>();
        boolean[][] vis=new boolean[N][N];
        for(boolean[] p:vis)
        {
            Arrays.fill(p,false);
        }
        if(kx==tx && ky==ty)
        return count;
        q.add(new pair(kx,ky,count));
        vis[kx][ky]=true;
        while(!q.isEmpty())
        {
            pair k=q.poll();
            int x=k.x;
            int y=k.y;
            int z=k.z;
            if(x==tx && y==ty)
            return z;
            for(int i=0;i<8;i++)
            {
                int cx=x+r[i];
                int cy=y+c[i];
                if(isvalid(cx,cy,vis,N))
                {
                    vis[cx][cy]=true;
                    q.add(new pair(cx,cy,z+1));
                }
            }
        }
        return -1;
    }
    boolean isvalid(int r,int c,boolean[][] vis,int n)
    {
        return(r>=0 && r<n && c>=0 && c<n && vis[r][c]==false);
    }
}
class pair
{
    int x,y,z;
    pair(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
}
