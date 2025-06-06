package Search;

public class BinarySearch {
   
   public static void main(String[] args) {

      int target = binarySearch(new int[] { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 }, 21);

      System.out.println(target);
   }
   
   public static int binarySearch(int[] unsorted, int target) {

      int low = 0;
      int high = unsorted.length - 1;

      while (low <= high) {

         int mid = low + (high - low) / 2;

         if (unsorted[mid] == target)
            return mid;

         if (unsorted[mid] < target) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      
      return -1;
   }
}
