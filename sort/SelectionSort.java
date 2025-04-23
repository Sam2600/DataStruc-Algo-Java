package Sort;

public class SelectionSort {
   
   public static void main(String[] args) {

      int[] unsorted = { 3, 6, 2, 5, 9, 10, 7, 4, 8, 1 };

      int[] sorted = selectionSort(unsorted);
      
      for (int i : sorted) {
         System.out.println(i);
      }
   }
   
   public static int[] selectionSort(int[] unsorted) {

      for (int i = 0; i < unsorted.length; i++) {

         int min = i;

         for (int j = i + 1; j < unsorted.length; j++) {
            if (unsorted[j] < unsorted[min]) {
               min = j;
            }
         }

         int tmp = unsorted[i];
         unsorted[i] = unsorted[min];
         unsorted[min] = tmp;
      }
      
      return unsorted;
   }
}
