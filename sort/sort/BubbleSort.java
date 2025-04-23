package sort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] sorted = bubbleSort(new int[] { 3, 5, 1, 6, 2, 7, 4, 8, 9 });
        
        for (int i : sorted) {
            System.out.println(i);
        }
    }
    
    public static int[] bubbleSort(int[] unsorted) {

        for (int i = 0; i < unsorted.length - 1; i++) {

            boolean isSwapped = false;

            for (int j = 0; j < unsorted.length - 1 - i; j++) {

                if (unsorted[j] > unsorted[j + 1]) {

                    int tmp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = tmp;

                    isSwapped = true;
                }
            }

            if (!isSwapped)
                break;
        }

        return unsorted;
    }

}