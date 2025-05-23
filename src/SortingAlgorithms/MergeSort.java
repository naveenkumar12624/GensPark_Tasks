package SortingAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {

    public List<Integer> mergeSortedArrays(int[] firstArray, int firstArrayLength, int[] secondArray, int secondArrayLength) {
        List<Integer> mergedList = new ArrayList<>();
        int firstIndex = 0, secondIndex = 0;

        while (firstIndex < firstArrayLength && secondIndex < secondArrayLength) {
            if (firstArray[firstIndex] != 0) {
                if (firstArray[firstIndex] <= secondArray[secondIndex]) {
                    mergedList.add(firstArray[firstIndex]);
                    firstIndex++;
                } else {
                    mergedList.add(secondArray[secondIndex]);
                    secondIndex++;
                }
            }
        }

        while (firstIndex < firstArrayLength) {
            mergedList.add(firstArray[firstIndex]);
            firstIndex++;
        }

        while (secondIndex < secondArrayLength) {
            mergedList.add(secondArray[secondIndex]);
            secondIndex++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstArrayLength = scanner.nextInt();
        int[] firstArray = new int[firstArrayLength];
        for (int i = 0; i < firstArrayLength; i++) {
            firstArray[i] = scanner.nextInt();
        }

        int secondArrayLength = scanner.nextInt();
        int[] secondArray = new int[secondArrayLength];
        for (int i = 0; i < secondArrayLength; i++) {
            secondArray[i] = scanner.nextInt();
        }

        MergeSort mergeSort = new MergeSort();
        List<Integer> mergedResult = mergeSort.mergeSortedArrays(firstArray, firstArrayLength, secondArray, secondArrayLength);

        for (int number : mergedResult) {
            System.out.print(number + " ");
        }
    }
}
