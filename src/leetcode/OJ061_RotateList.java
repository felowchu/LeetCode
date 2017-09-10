package leetcode;

import java.util.Stack;

public class OJ061_RotateList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val = val;}
    }

    public ListNode rotateRight(ListNode head , int k){
        if(k <= 0 || head == null) return head;
        int count = 0;
        ListNode pHead = head;
        while(pHead.next != null){
            pHead = pHead.next;
            count++;
        }
        pHead.next = head; count++;
        int num = k % count;
        num = count - num;
        while(num-- > 0){
            pHead = pHead.next;
        }
        ListNode rHeaad = pHead.next;
        pHead.next = null;
        return rHeaad;
    }
}
