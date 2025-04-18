package PM.PrintAllEvenFromOneToFifty;

public class Solution {
   
   public static void main(String[] args) {

      printAllEven();

   }
   
   public static void printAllEven()
   {
      int start = 1;
      int end = 50;

      while (start <= end) {
         
         if ((start % 2 == 0)) {
            System.out.print(start + " ");
         }
         
         start++;
      }
   }
}
