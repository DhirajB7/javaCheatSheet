package week2;

import java.util.*;
class Solution {
	
    public static List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {

    	HashMap<Integer, int[]> map = new HashMap<>();
        List<Integer> IDs = new ArrayList<>();
        for (int[] r : restaurants) {
            if (r[2] >= veganFriendly && r[3] <= maxPrice && r[4] <= maxDistance) {
                IDs.add(r[0]);
                map.put(r[0], r);
            }
        }
        Collections.sort(IDs, (id1, id2) -> {
            int rating1 = map.get(id1)[1];
            int rating2 = map.get(id2)[1];
            if (rating1 == rating2){
                return rating1 - rating2; 
            } else{
                return rating2 - rating1;
            }
            
        });
        return IDs;
         }

}