package leetcode;

public class InsertionSortList {

	public ListNode insertionSortList(ListNode head) {
		 ListNode curr = head;
		 ListNode next = null;
		
		  ListNode l = new ListNode(0);
		  
		  while (curr != null) {
		    next = curr.next;
		    
		    ListNode p = l;
		    while (p.next != null && p.next.val < curr.val)
		      p = p.next;
		    
		    
		    curr.next = p.next;
		    p.next = curr;
		    curr = next;
		  }
		  
		  return l.next;
	}

}
