package Algorithms.BackTracking;

import java.util.ArrayList;

public class Permutation {
   
   public ArrayList<Integer> list;

   public static void main(String[] args) {
      
      int[] para = new int[] { 1, 2, 3 };
      int[] result = new int[para.length];

      for (int i = 0; i < para.length; i++) {
         permutate(i, para, result);
      }
   }

   public static void permutate(int index, int[] para, int[] result)
   {
      if (index >= result.length) {
         return;
      }

      result[index] = para[index];
      index++;

      permutate(index, para, result);
   }
}
