package au.com.airmaxstudios.sorting;

public class Main {

    public static void main(String[] args) {


        Integer[] unsorted = {90, 8, 456, 212, 905, 23, 58, 239, 20};
        //insertionSort(unsorted);
        //selectionSort(unsorted);
        //bubbleSort(unsorted);
        mergeSort(unsorted);
        // write your code here
    }

    public static void printArray(Integer[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    /**
     * Inser
     */
    public static void insertionSort(Integer[] input) {

        for (int i = 1; i < input.length; i++) {
            int v = input[i];
            int j = i - 1;
            while ((j > -1) && (input[j] > v)) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = v;
            printArray(input);
        }


    }

    public static void bubbleSort(Integer input[]) {
        //Sorts a given array by bubble sort
        //Input: An array A[0..n − 1] of orderable elements
        // Output: Array A[0..n − 1] sorted in nondecreasing order

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j + 1] < input[j]) {
                    int temp = input[j + 1];

                    input[j + 1] = input[j];
                    input[j] = temp;
                }
            }
            printArray(input);
        }

    }


    public static void selectionSort(Integer input[]) {


        //Sorts a given array by selection sort
        //Input: An array A[0..n − 1] of orderable elements
        // Output: Array A[0..n − 1] sorted in nondecreasing order

        for (int i = 0; i < input.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < input.length - 1; ) {
                if (input[j] < input[min] && min < j) {
                    int temp = input[i];
                    input[i] = input[min];
                    input[min] = temp;
                }
            }
            printArray(input);

        }

    }

    public static Comparable[] mergeSort(Comparable[] list) {
        //If list is empty; no need to do anything
        if (list.length <= 1) {
            return list;
        }

        //Split the array in half in two parts
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        //Sort each half recursively
        mergeSort(first);
        mergeSort(second);

        //Merge both halves together, overwriting to original array
        merge(first, second, list);
        return list;
    }

    public static void quickSort() {

    }

    public static void radixSort() {
    }

    public static void countingSort() {
    }

    public static void bucketSort() {

    }

    public static void heapSort() {
    }

    public static void bogoSort() {
    }

    public static void quantumSort() {
    }

    public static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
        //Index Position in first array - starting with first element
        int iFirst = 0;

        //Index Position in second array - starting with first element
        int iSecond = 0;

        //Index Position in merged array - starting with first position
        int iMerged = 0;

        //Compare elements at iFirst and iSecond,
        //and move smaller element at iMerged
        while (iFirst < first.length && iSecond < second.length)
        {
            if (first[iFirst].compareTo(second[iSecond]) < 0)
            {
                result[iMerged] = first[iFirst];
                iFirst++;
            }
            else
            {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }

    public static Integer[] copyArray(Integer[] b, int begin, int end, Integer[] a) {
        for (int k = begin; k < end; k++)
            a[k] = b[k];
        return a;
    }


}
