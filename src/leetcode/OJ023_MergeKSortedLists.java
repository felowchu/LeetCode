package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OJ023_MergeKSortedLists {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val = val;}
    }

    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null)
                priorityQueue.add(lists[i]);
        }
        ListNode head = null;
        ListNode curNode = null;
        while (!priorityQueue.isEmpty()) {
            if(head == null){
                head = priorityQueue.poll();
                curNode = head;
                if (curNode.next != null)
                    priorityQueue.add(curNode.next);
                continue;
            }
            curNode.next = priorityQueue.poll();
            curNode = curNode.next;
            if (curNode.next != null)
                priorityQueue.add(curNode.next);
        }
        return head;
    }
}
