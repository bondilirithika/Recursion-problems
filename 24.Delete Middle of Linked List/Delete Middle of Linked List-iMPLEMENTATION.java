
class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if (head == null || head.next == null) {
            return null;
        }
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        Node midprev=solve(temp,0,(count/2)-1);
        midprev.next=midprev.next.next;
        return head;
    }
    
    Node solve(Node temp,int i,int tar)
    {
        if( i==tar)
        return temp;
        
        temp=temp.next;
        i++;
        return solve(temp,i,tar);
    }
}
