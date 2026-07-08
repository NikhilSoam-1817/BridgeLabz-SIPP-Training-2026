package DSA_practice.Sorting_2.merge_sort;

import java.util.Scanner;

public class Quick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n && sc.hasNextInt(); i++) {
            prices[i] = sc.nextInt();
        }

        quickSort(prices, 0, n - 1);

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            out.append(prices[i]);
            if (i < n - 1) {
                out.append(' ');
            }
        }

        System.out.print(out);
        sc.close();
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
