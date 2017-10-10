package leetcode;

public class OJ083_RemoveDuplicate {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode removeDuplicates(ListNode head){
        if(head == null) return head;
        ListNode curNode = head.next;
        ListNode tailNode = head;
        tailNode.next = null;
        while (curNode != null){
            int val = tailNode.val;
            if(curNode.val != val){
                tailNode.next = curNode;
                tailNode = tailNode.next;
                curNode = curNode.next;
                tailNode.next = null;
            }
            else curNode = curNode.next;
        }
        return head;
    }
}
