package beta;

public class LLMiddleNode_26 {
    private class ListNode{
        int val;
        ListNode next;

        public ListNode(){}

        public ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        }

        int n=0;
        ListNode temp = head;
        while(temp!=null){
            ++n;
            temp=temp.next;
        }
        int mid = n/2+1;
        temp = head;
        for(int i=1; i<mid; i++){
            temp = temp.next;
        }

        return temp;

    }
}
