package problems.FirstOccOfNoRepeatChar;

import java.util.HashMap;

public class Solution {
   
   public static void main(String[] args) {

      System.out.println(checkFirstNoRepeatChar("racecars"));
   }
   
   private static String checkFirstNoRepeatChar(String str) {

      HashMap<Character, Integer> map = new HashMap<>();

      for (int i = 0; i < str.length(); i++) {
         map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
      }

      for (int i = 0; i < str.length(); i++) {
         if (map.containsKey(str.charAt(i)) && map.get(str.charAt(i)) == 1) {
            return Character.toString(str.charAt(i));
         }
      }

      return "";
   }
}
