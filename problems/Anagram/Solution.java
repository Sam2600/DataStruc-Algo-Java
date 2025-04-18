package problems.Anagram;

import java.util.HashMap;

class Solution {

   public static void main(String[] args) {
      System.out.println(isAnagram("racecar", "carrace"));
   }

   public static boolean isAnagram(String s, String t) {

      if(s.length() != t.length()) {
         return false;
      }

      HashMap<Character, Integer> map = new HashMap<Character, Integer>();

      for(int i = 0; i < s.length(); i++) {
         map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
      }

      for (int j = 0; j < t.length(); j++) {

         if (!map.containsKey(t.charAt(j))) {
            return false;

         } else {

            map.put(t.charAt(j), map.getOrDefault(t.charAt(j), 0) - 1);

            if (map.getOrDefault(t.charAt(j), 0) == 0) {
               map.remove(t.charAt(j));
            }
         }
      }

      return map.isEmpty();
   }
}
