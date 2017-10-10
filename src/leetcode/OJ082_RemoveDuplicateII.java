package leetcode;

public class OJ082_RemoveDuplicateII {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val = val;}
    }

    public ListNode deleteDuplicates(ListNode head){
        ListNode curNode = head;
        ListNode preNode = new ListNode(-1);
        ListNode tailNode = preNode;
        while(curNode != null){
            if(curNode.next != null && curNode.next.val == curNode.val){
                int val = curNode.val;
                while (curNode != null && curNode.val == val)
                    curNode = curNode.next;
            }else if(curNode != null) {
                tailNode.next = curNode;
                curNode = curNode.next;
                tailNode = tailNode.next;
                tailNode.next = null;
            }
        }
        return preNode.next;
    }
}
