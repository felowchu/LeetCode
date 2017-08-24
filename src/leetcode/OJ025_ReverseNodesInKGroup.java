package leetcode;

import java.util.ArrayDeque;

public class OJ025_ReverseNodesInKGroup {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k){
        ArrayDeque<ListNode> queue = new ArrayDeque<>();
        ListNode curNode = head;
        ListNode preNode = new ListNode(0);
        ListNode tail = preNode;
        while(curNode != null){
            int cut = k;
            while(curNode != null && cut-- > 0){
                queue.addLast(curNode);
                curNode = curNode.next;
            }
            if(cut <= 0) {
                while (!queue.isEmpty()) {
                    tail.next = queue.pollLast();
                    tail = tail.next;
                }
            }else{
                while(!queue.isEmpty()){
                    tail.next = queue.pollFirst();
                    tail = tail.next;
                }
            }
            tail.next = null;
        }
        return preNode.next;
    }
}
