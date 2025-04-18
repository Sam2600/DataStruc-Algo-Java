package problems.RemoveVowelFromStr;

import java.util.HashSet;

public class Solution {
   
   public static void main(String[] args) {
      System.out.println(removeVowelFromStr("What is your name ?"));
   }
   
   private static String removeVowelFromStr(String str) {

      HashSet<Character> map = new HashSet<>();
      map.add('a');
      map.add('e');
      map.add('i');
      map.add('o');
      map.add('u');


      String result = "";

      for (int i = 0; i < str.length(); i++) {

         if (!map.contains(str.charAt(i))) {
            result = result + str.charAt(i);
         }
      }
      
      return result;

   }
}
