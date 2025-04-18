package PM.IsDivisableByANum;

public class Solution {
   
   public static void main(String[] args) {

      System.out.println(isDivisable(3 ,7));
   }
   
   public static boolean isDivisable(int num1, int num2) {
      return (num1 % num2) == 0;
   }
}
