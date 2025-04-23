package Sort;
public class QuickSort {

    public static void main(String[] args) {
        
        int[] test = { 3, 5, 1, 6, 2, 7, 4, 8, 9 };

        quickSort(test, 0, test.length - 1);

        for (int i : test) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] unsorted, int low, int high) {

        if (low < high) {
            int pivot = partition(unsorted, low, high);
            quickSort(unsorted, low, pivot - 1);
            quickSort(unsorted, pivot + 1, high);
        }
    }
    
    public static int partition(int[] unsorted, int left, int right) {

        int i = left;
        int j = right;

        while (i < j) {

            while (i < j && unsorted[j] >= unsorted[left]) {
                j--;
            }

            while (i < j && unsorted[i] <= unsorted[left]) {
                i++;
            }

            int temp = unsorted[i];
            unsorted[i] = unsorted[j];
            unsorted[j] = temp;
        }
        
        int temp = unsorted[left];
        unsorted[left] = unsorted[i];
        unsorted[i] = temp;

        return i;
    }
}