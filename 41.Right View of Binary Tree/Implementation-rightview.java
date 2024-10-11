class Solution {
    // Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        // add code here
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, ans, 0);
        return ans;
    }
    void solve(Node node, ArrayList<Integer> ans, int level) {
        // Base case
        if (node == null) {
            return;
        }
        
        // If this is the first time we're visiting this level, add the node's value
        if (level == ans.size()) {
            ans.add(node.data);
        }
        
        // Recur for right and left subtrees (right first for right view)
        solve(node.right, ans, level + 1);
        solve(node.left, ans, level + 1);
    }
}

//ITERATIVE:
class pair
{
    Node p;
    int q;
    pair(Node p,int q)
    {
        this.p=p;
        this.q=q;
    }
}
class Solution {
    // Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        // add code here.
        Queue<pair> queue=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        
        queue.add(new pair(root,0));
        while(!queue.isEmpty())
        {
            pair temp=queue.poll();
            Node m=temp.p;
            int level=temp.q;
            
            map.putIfAbsent(level,new ArrayList<Integer>());
            ArrayList<Integer> t=map.get(level);
            t.add(m.data);
            map.put(level,t);
            if(m.left!=null)
            {
               queue.add(new pair(m.left,level+1));
            }
            if(m.right!=null)
            {
                queue.add(new pair(m.right,level+1));
            }
        }
        for(int i=0;i<map.size();i++)
        {
            ArrayList<Integer> g=map.get(i);
            ans.add(g.get(g.size()-1));
        }
        return ans;
    }
}
