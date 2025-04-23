package Sort;

public class HeapSort {

   public static void main(String[] args) {

      int[] unsorted = { 3, 6, 2, 5, 9, 10, 7, 4, 8, 1 };

      for (int i = unsorted.length / 2 - 1; i >= 0; i--) {
         heapSort(unsorted, i);
      }

      for (int i : unsorted) {
         System.out.println(i);
      }
   }

   public static void heapSort(int[] unsorted, int i) {

      while (true) {

         int temp = i;
         int left = getLeft(temp);
         int right = getRight(temp);

         if (left < unsorted.length && unsorted[temp] < unsorted[left]) {
            temp = left;
         }

         if (right < unsorted.length && unsorted[temp] < unsorted[right]) {
            temp = right;
         }

         //deBug(top, temp);

         if (temp == i) {
            break;
         }

         int tmp = unsorted[i];
         unsorted[i] = unsorted[temp];
         unsorted[temp] = tmp;

         i = temp;

      }

   }

   public static int getParent(int i) {
      return (i - 1) / 2;
   }

   public static int getLeft(int i) {
      return (2 * i) + 1;
   }

   public static int getRight(int i) {
      return (2 * i) + 2;
   }

   public static void deBug(int top, int temp) {
      System.out.println("=====");
      System.out.println("top : " + top);
      System.out.println("temp : " + temp);
      System.out.println("=====");
      System.out.println();
   }
}