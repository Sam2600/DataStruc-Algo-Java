package problems.MadhavArray;

public class Solution {
   
   public static void main(String[] args) {
      System.out.println(isMadhavArray(new int[] {18, 9, 10, 6, 6, 6} ));
   }
   
   // { 5, 2, 3, 4, 5, 6, 7, 8, 9 , 10, 11}
   public static boolean isMadhavArray(int[] arr)
   {
      int i = 1;
      int k = 2;
      int result = arr[0];

      int total = 0;

      while (i <= k && k < arr.length) {

         total += arr[i];

         if (i == k) {

            if (result != total) {
               return false;
            }

            k = k * 2 + 1;
            total = 0;
         }

         i++;
      }
      
      return true;
   }
}
