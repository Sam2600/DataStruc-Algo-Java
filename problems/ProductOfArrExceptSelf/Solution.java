package problems.ProductOfArrExceptSelf;

public class Solution {

   public int[] productExceptSelf(int[] nums) {

      int i = 0;
      int[] result = new int[nums.length];

      while (i < nums.length) {
         
         int tprd = 1;

         for (int j = 0; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
               tprd *= nums[j];
            }
         }
         
         result[i] = tprd;
         i++;
      }

      return result;
   }
}