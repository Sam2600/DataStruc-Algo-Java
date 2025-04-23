package sort;

public class SelectionSort {

    public static void main(String[] args) {

        int[] sorted = selectionSort(new int[] { 3, 5, 1, 6, 2, 7, 4, 8, 9 });

        for (int i : sorted) {
            System.out.println(i);
        }
    }
    
    public static int[] selectionSort(int[] unsorted) {

        for (int i = 0; i < unsorted.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < unsorted.length; j++) {

                if (unsorted[j] < unsorted[min]) {
                    min = j;
                }
            }

            int temp = unsorted[min];
            unsorted[min] = unsorted[i];
            unsorted[i] = temp;
        }
        
        return unsorted;
    }
}