package problems.TwoSum;

import java.util.HashMap;

public class Solution {
   public static void main(String[] args) {
      
      int[] result = twoSum(new int[] { 1, 2, 3, 7, 8}, 9);
      
      for (int i : result) {
         System.out.println(i);
      }
   }
   
   private static int[] twoSum(int[] arr, int target) {

      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      
      int[] result = new int[2];

      for (int i = 0; i < arr.length; i++) {

         if (!map.containsKey(target - arr[i])) {
            map.put(arr[i], i);
         } else {
            result[0] = map.get(target - arr[i]);
            result[1] = i;
            return result;
         }

      }
      return result;
   }
}
