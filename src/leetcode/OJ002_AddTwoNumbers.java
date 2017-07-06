package leetcode;

public class OJ002_AddTwoNumbers {
	public static void main(String[] args){
		
	}
	
	class ListNode{
		int val;
		ListNode next;
		ListNode(int i){
			val = i;
		}
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode head = new ListNode(0);
		ListNode p = l1, q = l2, m = head;
		int carry = 0;
		while(p!=null || q!=null){
			int i = (p != null) ? p.val : 0;
			int j = (q != null) ? p.val : 0;
			int sum = carry + i + j; 
			carry = sum/10;
			m.next = new ListNode(sum%10);
			m = m.next;
			if(p != null) p = p.next;
			if(q != null) q = q.next;
		}
		if(carry > 0){
			m.next = new ListNode(1);
		}
		return head.next;
	}
}
