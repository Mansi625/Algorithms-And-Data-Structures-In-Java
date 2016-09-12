package au.com.airmaxstudios.sorting;

public class Main {

    public static void main(String[] args) {


        Integer[] unsorted = {90, 8, 456, 212, 905, 23, 58, 239, 20};
        insertionSort(unsorted);
        // write your code here
    }

    public static void printArray(Integer[] input){
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    /**
     *
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
    public static void bubbleSort(){

    }
    public static void selectionSort(){

    }

    public static void mergeSort(){

    }

    public static void quickSort(){

    }

    public static void radixSort(){}

    public static void countingSort(){}
    public static void bucketSort(){

    }
    public static void heapSort(){}

    public static void bogoSort(){}
    public static void quantumSort(){}


}
