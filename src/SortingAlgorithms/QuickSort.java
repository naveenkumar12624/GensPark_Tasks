package SortingAlgorithms;
import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int partitionIndex = partition(arr, low, high);

            // Recursively sort left and right parts
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }


    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Pointer for smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // If element is smaller than pivot
                i++;
                swap(arr, i, j);
            }
        }
        // Swap pivot to its correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap function
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
