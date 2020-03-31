package week1;

public class MergeTwoSortedList {
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    
		 ListNode answerNode = new ListNode(-1);
		 ListNode head = answerNode;
		 
		 while(l1!=null && l2!=null) {
			 if(l1.val<=l2.val) {
				answerNode.next = l1;
				l1 = l1.next; 
			 }else{
                 answerNode.next = l2;
				l2 = l2.next; 
             }
             answerNode = answerNode.next;
		 }
		 
		 if(l1==null) {
			 answerNode.next=l2;
		 }
		 
		 if(l2==null) {
			 answerNode.next=l1;
		 }
		 return head.next;
        
	    }
	 
}
