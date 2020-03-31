package week3;
import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {

	int capacity;
	LinkedList<Integer> al;
	HashMap<Integer, Integer> hm;
	
    public LRUCache(int capacity) {
         this.capacity = capacity;
         al = new LinkedList<Integer>();
         hm = new HashMap<Integer, Integer>();
    }
    
    public int get(int key) {
    	if (hm.get(key) == null) {
        	 return -1;
        }else {
        	al.remove(new Integer(key));
            al.addFirst(key);
            return hm.get(key);
        }
        
    }
    
    public void put(int key, int value) {
    hm.put(key, value);
       if(hm.size()>capacity) {
    	   hm.remove(al.removeLast());
       }
       al.remove(new Integer(key));
       al.addFirst(key);
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */