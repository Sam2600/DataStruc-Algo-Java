package PM.SumOfEvenValuesInArray;

public class Solution {
   
   public static void main(String[] args) {

      int result = sumOfEvens(new int[] { 1, 2, 3, 4, 5, 6, 7 });

      System.out.println(result);
   }
   
   public static int sumOfEvens(int[] input) {
      
      int i = 0;
      int j = input.length - 1;

      int evenSum = 0;

      while (i < j) {

         if ((input[i] % 2) == 0) {
            evenSum += input[i];
         }

         if ((input[j] % 2) == 0) {
            evenSum += input[j];
         }

         i++;
         j--;
      }
      
      if (i == j && (input[i] % 2) == 0) {
         evenSum += input[i];
      }

      return evenSum;
   }
}
