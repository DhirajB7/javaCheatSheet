package leetcode;

import java.util.PriorityQueue;

public class MergeKSortedList {
	

	 public ListNode mergeKLists(ListNode[] lists) {
		 
		 if(lists.length==0 || lists==null) {
			 return null;
		 }
		 
			
			 PriorityQueue<ListNode> pql = new PriorityQueue<ListNode>(lists.length,(a,b)->a.val-b.val);
			 
			 ListNode root = new ListNode(0);
			 ListNode answer = root;
			 
			 for(ListNode node : lists) {
				 if(node!=null) {
				 pql.add(node);
				 }
			 }
			 
			 while (!pql.isEmpty()){
		            answer.next=pql.poll();
		            answer=answer.next;
		            
		            if (answer.next!=null)
		                pql.add(answer.next);
		        }
			 
				return root.next;
		 
		 
		
	        
	    }

}
