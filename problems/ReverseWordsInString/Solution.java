package problems.ReverseWordsInString;

import java.util.ArrayList;

public class Solution {

   public static void main(String[] args) {
      reverseWords("I hate my job");
   }

   public static String reverseWords(String s) {
   
      char[] char_arr = s.toCharArray();

      ArrayList<String> list = new ArrayList<String>();

      StringBuffer sb = new StringBuffer();

      for (int i = 0; i < char_arr.length; i++) {

         if (char_arr[i] == ' ') {

            list.add(sb.toString());
            sb = new StringBuffer();

         } else {

            sb.append(char_arr[i]);
         }

      }
      
      return "";
   }
}
