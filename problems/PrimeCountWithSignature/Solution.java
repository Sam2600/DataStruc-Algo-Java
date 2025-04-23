package problems.PrimeCountWithSignature;

public class Solution {

   public static void main(String[] args) {
      System.out.println(primeCount(11, 29));
   }

   public static int primeCount(int start, int end)
   {
      int count = 0;

      while (start < end) {

         if (isPrime(start)) {
            count++;
         }

         if (isPrime(end)) {
            count++;
         }

         start++;
         end--;
      }

      if (start == end && isPrime(start)) {
         count++;
      }

      return count;
   }
   
   static boolean isPrime(int n) {

      if (n <= 1)
         return false;

      for (int i = 2; i < n; i++)
         if (n % i == 0)
            return false;

      return true;
   }
}