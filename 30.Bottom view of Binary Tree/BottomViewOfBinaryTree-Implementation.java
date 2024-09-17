//ITERATIVE APPROACH

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        //bfs.if we are going to the left child->-1,if we are going the right child->+1
        if(root==null)
        return new ArrayList<Integer>();
        Queue<Pair> q=new LinkedList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            Node n=p.x;
            int level=p.y;
            map.put(level,n.data);
            
            if(n.left!=null)
            {
                q.add(new Pair(n.left,level-1));
            }
            if(n.right!=null)
            {
                q.add(new Pair(n.right,level+1));
            }
            
        }
        ArrayList<Integer> arr=new ArrayList<>(map.keySet());
        Collections.sort(arr);
        int ind=0;
        for(int i:arr)
        {
            int t=map.get(i);
            arr.set(ind++,t);
        }
        return arr;
    }
}
class Pair
{
    Node x;
    int y;
    Pair(Node x,int y)
    {
        this.x=x;
        this.y=y;
    }
}


---------------------------------------------------------------------------------------------------------------------------------------
//RECURSIVE APPROACH

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        //bfs.if we are going to the left child->-1,if we are going the right child->+1
        if(root==null)
        return new ArrayList<Integer>();
        Queue<Pair> q=new LinkedList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        q.add(new Pair(root,0));
        bfs(q,map);
        ArrayList<Integer> arr=new ArrayList<>(map.keySet());
        Collections.sort(arr);
        int ind=0;
        for(int i:arr)
        {
            int t=map.get(i);
            arr.set(ind++,t);
        }
        return arr;
    }
    
    void bfs(Queue<Pair> q,HashMap<Integer,Integer> map)
    {
        if(q.isEmpty())
        return;
        
        Pair p=q.poll();
        Node n=p.x;
        int level=p.y;
        map.put(level,n.data);
            
        if(n.left!=null)
        {
            q.add(new Pair(n.left,level-1));
        }
        if(n.right!=null)
        {
            q.add(new Pair(n.right,level+1));
        }
        bfs(q,map);
    }
    
}
class Pair
{
    Node x;
    int y;
    Pair(Node x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
