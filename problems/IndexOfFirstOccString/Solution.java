package problems.IndexOfFirstOccString;

public class Solution {
   public static void main(String[] args) {

   }
   
   public int strStr(String haystack, String needle) {

      char[] needle_char = needle.toCharArray();
      char[] haystack_char = haystack.toCharArray();

      for (int i = 0; i < haystack_char.length; i++) {

         int needle_i = 0;

         if (haystack_char[i] == needle_char[needle_i]) {

            int index = i;
            boolean isFound = true;

            while (needle_i < needle_char.length && isFound) {

               isFound = false;

               if (index < haystack.length()) {

                  if (needle_char[needle_i] == haystack_char[index]) {
                     needle_i++;
                     index++;
                     isFound = true;
                  }

               } else {
                  break;
               }

            }

            if (isFound) {
               return i;
            }
         }
      }

      return -1;
   }
}
