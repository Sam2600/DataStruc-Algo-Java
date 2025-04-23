package sort;

public class MergeSort {

    public static void main(String[] args) {

        int[] test = { 3, 5, 1, 6, 2, 7, 4, 8, 9 };

        mergeSort(test, 0, test.length - 1);

        for (int i : test) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] unsorted, int low, int high) {

        if (low < high) {

            int mid = low + (high - low) / 2;

            mergeSort(unsorted, low, mid);

            mergeSort(unsorted, mid + 1, high);

            merge(unsorted, low, mid, high);

        }

    }
    
    public static void merge(int[] unsorted, int low, int mid, int high) {

        int[] temp = new int[unsorted.length];

        for (int i = low; i <= high; i++) {
            temp[i] = unsorted[i];
        }

        int k = low;
        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {

            if (temp[i] < temp[j]) {
                unsorted[k] = temp[i];
                i++;
            } else {
                unsorted[k] = temp[j];
                j++;
            }

            k++;
        }
        
        while (i <= mid) {
            unsorted[k] = temp[i];
            i++;
            k++;
        }
    }
}