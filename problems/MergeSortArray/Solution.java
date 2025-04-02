package problems.MergeSortArray;

public class Solution {

   public static void main(String[] args) {

      int[] arr1 = new int[] { 1, 2, 3, 0, 0, 0, 0 };
      int[] arr2 = new int[] { 2, 4, 5, 6 };
      
      merge(arr1, 3, arr2, 4);
   }

   public static void merge(int[] nums1, int m, int[] nums2, int n) {
      
      int[] bk_nums1 = new int[m + n];

      for (int i = 0; i < nums1.length; i++) {
         bk_nums1[i] = nums1[i];
      }
      
      int arr_a_index = 0;
      int arr_b_index = 0;

      for (int i = 0; i < nums1.length; i++) {

         if (bk_nums1[i] == 0) {

            nums1[i] = nums2[arr_b_index];
            arr_b_index++;
            
         } else {

            if (bk_nums1[arr_a_index] < nums2[arr_b_index]) {

               nums1[i] = bk_nums1[arr_a_index];
               arr_a_index++;
   
            } else if (bk_nums1[arr_a_index] > nums2[arr_b_index]) {
               
               nums1[i] = nums2[arr_b_index];
               arr_b_index++;
   
            } else {
   
               nums1[i] = bk_nums1[arr_a_index];
               arr_a_index++;
   
               i++;
   
               nums1[i] = nums2[arr_b_index];
               arr_b_index++;
            }
         }
      }
   }
}