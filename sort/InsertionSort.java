package Sort;

public class InsertionSort {

    public static void main(String[] args) {

        int[] sorted = insertionSort(new int[] { 3, 5, 1, 6, 2, 7, 4, 8, 9 });

        for (int i : sorted) {
            System.out.println(i);
        }
    }
    
    public static int[] insertionSort(int[] unsorted) {
        
        for (int i = 1; i < unsorted.length; i++) {

            int j = i - 1;
            int temp = unsorted[i];

            while (j >= 0 && temp < unsorted[j]) {
                unsorted[j + 1] = unsorted[j];
                j--;
            }

            unsorted[j + 1] = temp;
        }
        
        return unsorted;
    }
}