package leetcode;

public class OJ086_PartitionList2 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode partition(ListNode head, int x){
        ListNode low = new ListNode(0);
        ListNode high = new ListNode(0);
        ListNode list1 = low, list2 = high;
        while(head != null){
            if(head.val < x){
                list1.next = head;
                list1 = list1.next;
                head = head.next;
                list1.next = null;
            }else {
                list2.next = head;
                list2 = list2.next;
                head = head.next;
                list2.next = null;
            }
        }
        list1.next = high.next;
        high.next = null;
        return low.next;
    }
}
