package DSA_practice.Binary_search;

class PeakElement {
    public static int findPeakElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);

        if (peakIndex >= 0) {
            System.out.println("Peak element index: " + peakIndex + ", value: " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }
    }
}
