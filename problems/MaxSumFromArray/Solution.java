package problems.MaxSumFromArray;

public class Solution {
   public static void main(String[] args) {
      System.out.println(maxSum(new int[] {2, 3, 4, -4, 5, -12, 11, 4}));
   }
   
   // [2, 3, 4, -4, 5, -12, 11, 4]
   private static int maxSum(int[] arr)
   {
      int currentMax = arr[0];
      int maxSoFar = arr[0];

      for (int i = 1; i < arr.length; i++) {

         currentMax = currentMax + arr[i];

         if (currentMax < arr[i]) {
            currentMax = arr[i];
         }

         if (maxSoFar < currentMax) {
            maxSoFar = currentMax;
         }
      }

      return maxSoFar;
   }
}
