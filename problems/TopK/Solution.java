package problems.TopK;

import java.util.Queue;
import java.util.LinkedList;

public class Solution {
   
   public static void main(String[] args) {

      countBits(6);
   }
   
   public static int[] countBits(int n) {

      int[] result = new int[n + 1];

      result[0] = 0;

      Queue<String> queue = new LinkedList<String>();

      queue.offer("1");

      int i = 1;

      while(i < n) {

         String q = queue.poll();

         System.out.println("=================");
         System.out.println(q);
         System.out.println("=================");
         
         StringBuilder sb1 = new StringBuilder(q);
         StringBuilder sb2 = new StringBuilder(q);

         result[i] = countOnes(q);
         i++;

         sb1.append("0");
         sb2.append("1");

         queue.offer(sb1.toString());
         queue.offer(sb2.toString());

      }

      return result;
   }

   public static int countOnes(String str) {

      String s = "I";
      s.concat("Love you");

      System.out.println(s);
      
      int i = 0;
      int j = str.length() - 1;

      int count = 0;

      while (i < j) {

         if(str.charAt(i) == '1') {
            count++;
         }

         if(str.charAt(j) == '1') {
            count++;
         }

         i++;
         j--;
      }

      if(i == j && str.charAt(i) == '1') {
         count++;
      }
      System.out.println("================");
      System.out.println(count);
      System.out.println("================");
      return count;
   }
}
