package com.latecoder.sorting;

public class Quicksort {
    public static void main(String[] args) {
        // Initial array: [3, 2, 1, 5, 6, 4]
        // Finding k=2 (second smallest element)
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        // Find and print the kth smallest element
        System.out.println("The " + k + "th smallest element is: " + Solution.kthSmallest(arr, k));
    }
}

/**
 * Solution class provides Quickselect algorithm to find kth smallest element in an array.
 */
class Solution {
    /**
     * Returns the kth smallest element in the array.
     * @param arr The input array
     * @param k The order of the smallest element to find (1-based)
     * @return The kth smallest element
     */
    public static int kthSmallest(int[] arr, int k) {
        // k=2 becomes k=1 (zero-based index)
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    /**
     * Quickselect recursive function to find kth smallest element.
     * @param arr The input array
     * @param left Left index of the subarray
     * @param right Right index of the subarray
     * @param k Index of the kth smallest element (zero-based)
     * @return The kth smallest element
     */
    private static int quickSelect(int[] arr, int left, int right, int k) {
        // Base case
        if (left == right) {
            return arr[left];
        }

        // First iteration: pivot=4 (rightmost element)
        // After first partition: [3, 2, 1, 4, 6, 5] returns pivotIndex=3
        // Second iteration: pivot=2 (on left subarray [3, 2, 1])
        // After second partition: [1, 2, 3] returns pivotIndex=1
        int pivotIndex = partition(arr, left, right);

        // If pivotIndex is the kth position, return its value
        if (k == pivotIndex) {
            // Found the kth element (k=1, second smallest)
            return arr[k];
        } else if (k < pivotIndex) {
            // k=1 < pivotIndex=3, so search left part
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            // If k > pivotIndex, would search right part
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    /**
     * Partitions the array around a pivot and returns the pivot index.
     * Elements less than or equal to the pivot are moved to the left.
     * @param arr The input array
     * @param left Left index
     * @param right Right index (pivot)
     * @return The index of the pivot after partition
     */
    private static int partition(int[] arr, int left, int right) {
        // First partition:
        // pivot=4, initial: [3, 2, 1, 5, 6, 4]
        // i=0: [3, 2, 1, 5, 6, 4] (3≤4, i=1)
        // i=1: [3, 2, 1, 5, 6, 4] (2≤4, i=2)
        // i=2: [3, 2, 1, 5, 6, 4] (1≤4, i=3)
        // i=3: [3, 2, 1, 5, 6, 4] (5>4, no swap)
        // i=4: [3, 2, 1, 5, 6, 4] (6>4, no swap)
        // Final swap: [3, 2, 1, 4, 6, 5]
        int pivot = arr[right]; // Choose the rightmost element as pivot
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j); // Move smaller element to the left
                i++;
            }
        }
        swap(arr, i, right); // Place pivot in its correct position
        return i;
    }

    /**
     * Swaps two elements in the array.
     * @param arr The input array
     * @param i First index
     * @param j Second index
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
