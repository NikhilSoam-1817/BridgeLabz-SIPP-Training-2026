package DSA_practice.Sorting_2.merge_sort;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        sc.nextLine();
        String line = "";
        while (sc.hasNextLine()) {
            String next = sc.nextLine().trim();
            if (!next.isEmpty()) {
                line = next;
                break;
            }
        }
        sc.close();

        int[] ids = new int[n];
        Matcher matcher = Pattern.compile("-?\\d+").matcher(line);
        int index = 0;
        while (matcher.find() && index < n) {
            ids[index++] = Integer.parseInt(matcher.group());
        }

        if (index < n) {
            // If not enough numbers found in the bracketed line, try reading remaining tokens from the input line
            String[] parts = line.replaceAll("[\[\],]", " ").trim().split("\\s+");
            index = 0;
            for (String part : parts) {
                if (part.isEmpty()) {
                    continue;
                }
                try {
                    ids[index++] = Integer.parseInt(part);
                    if (index == n) {
                        break;
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        }

        mergeSort(ids, 0, n - 1);
        printArray(ids);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    private static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        System.out.print(sb.toString());
    }
}
