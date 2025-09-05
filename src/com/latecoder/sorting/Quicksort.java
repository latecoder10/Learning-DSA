package com.latecoder.sorting;

import static com.latecoder.colour.Colour.*;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        CYAN.println("Initial array: " + java.util.Arrays.toString(arr));
        YELLOW.println("Finding the " + k + "th smallest element");
        BRIGHT_MAGENTA.println("Using Quickselect Algorithm:");
        BRIGHT_GREEN.print("The " + k + "th smallest element is: ");
        System.out.println(Solution.kthSmallest(arr, k));
    }
}

/**
 * Solution class provides Quickselect algorithm to find kth smallest element in an array.
 */
class Solution {
    private static int recursionLevel = 0;

    public static int kthSmallest(int[] arr, int k) {
        BRIGHT_CYAN.println("\n=== Starting QuickSelect to find the " + k + "th smallest element ===");
        recursionLevel = 0;
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    private static int quickSelect(int[] arr, int left, int right, int k) {
        String indent = "│ ".repeat(recursionLevel);
        BRIGHT_BLUE.println("\n" + indent + "┌── Recursion Level " + recursionLevel);
        CYAN.println(indent + "│ Calling quickSelect(left=" + left + ", right=" + right + ", k=" + k + ")");
        GREEN.println(indent + "│ Subarray: " + java.util.Arrays.toString(java.util.Arrays.copyOfRange(arr, left, right + 1)));

        // Base case: only one element
        if (left == right) {
            YELLOW.println(indent + "│ Only one element left → Returning: " + arr[left]);
            MAGENTA.println(indent + "└── End of Level " + recursionLevel + "\n");
            return arr[left];
        }

        recursionLevel++;
        int pivotIndex = partition(arr, left, right);
        recursionLevel--;

        BRIGHT_WHITE.println(indent + "│ Pivot selected at index " + pivotIndex + " with value " + arr[pivotIndex]);
        BRIGHT_CYAN.println(indent + "│ Array after partition: " + java.util.Arrays.toString(arr));

        if (k == pivotIndex) {
            BRIGHT_GREEN.println(indent + "│ ✔ k == pivotIndex → Found the kth smallest: " + arr[k]);
            MAGENTA.println(indent + "└── End of Level " + recursionLevel + "\n");
            return arr[k];
        } else if (k < pivotIndex) {
            BRIGHT_YELLOW.println(indent + "│ ↙ k < pivotIndex → Recur on LEFT subarray");
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            BRIGHT_YELLOW.println(indent + "│ ↘ k > pivotIndex → Recur on RIGHT subarray");
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        String indent = "│ ".repeat(recursionLevel);
        int pivot = arr[right];
        int i = left;

        BRIGHT_MAGENTA.println(indent + "├── Partitioning with pivot=" + pivot + " at index " + right);

        for (int j = left; j < right; j++) {
            BLUE.print(indent + "│ Comparing arr[" + j + "]=" + arr[j] + " with pivot=" + pivot + " → ");
            if (arr[j] <= pivot) {
                GREEN.println("✓ swap needed");
                swap(arr, i, j);
                CYAN.println(indent + "│   Swapped arr[" + i + "] and arr[" + j + "] → " + java.util.Arrays.toString(arr));
                i++;
            } else {
                RED.println("✗ no swap");
            }
        }

        YELLOW.println(indent + "│ Swapping pivot into correct position between arr[" + i + "] and arr[" + right + "]");
        swap(arr, i, right);
        BRIGHT_GREEN.println(indent + "│ Partitioned array: " + java.util.Arrays.toString(arr));
        BRIGHT_BLUE.println(indent + "└── Pivot is now at index " + i);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

