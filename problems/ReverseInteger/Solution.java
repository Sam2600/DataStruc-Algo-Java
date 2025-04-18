package problems.ReverseInteger;

public class Solution {
   public static void main(String[] args) {
      System.out.println(reverseInteger(-12345));
   }
   
   private static int reverseInteger(int i) {

      boolean isNegative = false;

      if (i < 0) {
         isNegative = true;
         i = -1 * i;
      }

      char[] char_arr = ("" + i).toCharArray();

      int start = 0;
      int end = char_arr.length - 1;

      while (start < end) {

         char tmp = char_arr[start];
         char_arr[start] = char_arr[end];
         char_arr[end] = tmp;

         start++;
         end--;
      }

      String result = String.valueOf(char_arr);

      if (isNegative) {
         result = "-" + result;
      }
      return Integer.parseInt(result);
   }
}
