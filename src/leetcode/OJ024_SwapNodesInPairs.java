package leetcode;

public class OJ024_SwapNodesInPairs {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode swapPairs(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode nextNode = head.next.next;
        ListNode preNode = head.next;
        ListNode curNode = head;
        preNode.next = curNode;
        curNode.next = swapPairs(nextNode);
        return preNode;
    }
}
