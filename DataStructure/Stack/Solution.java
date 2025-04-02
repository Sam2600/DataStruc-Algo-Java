package DataStructure.Stack;

import java.util.Stack;

public class Solution {
   public static void main(String[] args) {

      Helper helper = new Helper();
      int[] result = helper.nextGreaterValue(new int[] {1, 3, 5, 7, 9, 0});

      for (int i : result) {
         System.out.print(i + ", ");
      }

      System.out.println();

      System.out.println("=============================");

      System.out.println(helper.reverseString("GFEDCBA"));

      System.out.println("=============================");

      System.out.println(helper.isParentheses("{]}"));
   }
}

class Helper {

   public String reverseString(String str)
   {
      char[] char_arr = str.toCharArray();

      Stack<Character> stack = new Stack<Character>();

      for (char c : char_arr) {
         stack.push(c);
      }

      for (int i = 0; i < char_arr.length; i++) {
         char_arr[i] = stack.pop();
      }

      return new String(char_arr);
   }
   
   public int[] nextGreaterValue(int[] arr)
   {
      Stack<Integer> stack = new Stack<Integer>();

      int[] result = new int[arr.length];

      for (int i = (arr.length - 1); i >= 0; i--) {

         if (!stack.isEmpty()) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
               stack.pop();
            }

         }

         if (stack.isEmpty()) {
            result[i] = -1;
         } else {
            result[i] = stack.peek();
         }

         stack.push(arr[i]);
      }

      return result;
   }

   public boolean isParentheses(String str) {
      
      char[] char_arr = str.toCharArray();

      Stack<Character> stack = new Stack<Character>();

      for (char c : char_arr) {

         if (c == '{' || c == '(' || c == '[') {
            stack.push(c);
         }

         if (c == '}' || c == ')' || c == ']') {

            if (stack.isEmpty()) {
               return false;
            }

            char pop_char = stack.pop();

            if ((pop_char == '{' && c != '}') || (pop_char == '(' && c != ')') || (pop_char == '[' && c != ']')) {
               return false;
            }
         }
      }
      
      return stack.isEmpty();
   }
}