package leetcode;

public class OJ086_PartitionList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }

    public ListNode partition(ListNode head, int x){
        ListNode preNode = new ListNode(x);
        ListNode start = preNode;
        start.next = head;
        ListNode end = head;
        while(end != null){
            if(end.val < x){
                ListNode temp = start.next;
                int value = end.val;
                while (temp != end){
                    int val = temp.val;
                    temp.val = value;
                    value = val;
                    temp = temp.next;
                }
                end.val = value;
                start = start.next;
            }
            end = end.next;
        }
        return preNode.next;
    }
}
