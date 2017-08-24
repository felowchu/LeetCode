package leetcode;

public class OJ019_RemoveNthNodeFromEndOfList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    //找到倒数k+1个，连到k-1个上
    public ListNode removeNthFromEnd(ListNode head, int n){
        if(n <= 0)
            return null;
        ListNode preNode = head;
        for(int i =0; i < n; i++){
            if(preNode.next == null && i != n-1)
                return null;
            preNode = preNode.next;
        }
        if(preNode == null)
            return head.next;
        ListNode lastNode = head;
        while(preNode.next != null){
            lastNode = lastNode.next;
            preNode = preNode.next;
        }
        lastNode.next = lastNode.next.next;
        return head;
    }
}
