package problems.SubSequenceString;

public class Soultion {

   public static void main(String[] args) {
      //System.out.println(isSubSeqStr("axbxc", "ah"));
      System.out.println(isSubSeqStrButBetter("abcde", "aec"));
   }
   
   private static boolean isSubSeqStr(String str, String seq)
   {
      char[] seq_str_arr = seq.toCharArray();
      char[] char_str_arr = str.toCharArray();

      int j = 0;
      int count = 0;

      for (char ssa : seq_str_arr) {

         for (int i = j; i < char_str_arr.length; i++) {

            if (char_str_arr[i] == ssa) {
               j++;
               count++;
               break;
            }

            j++;
         }
      }

      return count == seq_str_arr.length;
   }
   
   private static boolean isSubSeqStrButBetter(String str, String seq)
   {
      int i = 0;
      int j = 0;

      while (i < str.length() && j < seq.length()) {

         if (str.charAt(i) == seq.charAt(j)) {
            j++;
         }
         i++;
      }

      return j == seq.length();
   }
}