

public class fixedWindow {
    public int maxSubarrayOfSizeK(int[] cpuLoad, int k) {
        int windowSum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0;
        for (int end = 0; end < cpuLoad.length; end++) {
            windowSum += cpuLoad[end];
            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= cpuLoad[start];
                start++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        fixedWindow fw = new fixedWindow();
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(fw.maxSubarrayOfSizeK(arr, k));
    }
}
