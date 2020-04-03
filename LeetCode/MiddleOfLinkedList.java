package leetcode;

public class MiddleOfLinkedList {


	 public ListNode middleNode(ListNode head) {
			
			ListNode[] llArr = new ListNode[100];
			
			int i = 0 ;
			
			while (head!= null) {

				llArr[i] = head;
				
				i++;
				
				head = head.next;  
				
			}
			
			if( i==1 || i==2) {
	            System.out.println("a");
				return llArr[i-1];
			}else{
				return llArr[i/2];
			}
			
		}
	 
}
