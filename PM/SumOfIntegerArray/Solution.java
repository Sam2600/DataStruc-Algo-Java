package PM.SumOfIntegerArray;

public class Solution {
   public static void main(String[] args) {

      int result = getSum(new int[] { 1, 2, 4, 5, 6 });
      
      System.out.println(result);
   }
   
   public static int getSum(int[] arr) {

      int i = 0;
      int j = arr.length - 1;

      int sum = 0;

      while (i < j) {
         sum += arr[i] + arr[j];
         i++;
         j--;
      }

      if (i == j) {
         sum += arr[i];
      }

      return sum;
   }
}
