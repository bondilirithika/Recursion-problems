//ITERATIVE:
/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode temp=head;
        DLLNode prev=null;
        while(temp!=null)
        {
            DLLNode front=temp.next;
            temp.next=prev;
            temp.prev=front;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}

//RECURSIVE:

/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    // 4->5
    // 5->4
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head==null ||head.next==null)
        return head;
        
        DLLNode newhead=reverseDLL(head.next);
        DLLNode front=head.next;
        front.next=head;
        front.prev=null;
        head.next=null;
        head.prev=front;
        return newhead;
    }
}
