package DSA_practice;

public class BubbleSortSwapCount {
    
    public static int bubbleSortSwapCount(int[] nums) {
        int n = nums.length;
        int swapCount = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        
        return swapCount;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 1};
        System.out.println("Input: [4,3,2,1]");
        System.out.println("Output: " + bubbleSortSwapCount(nums1));
        
        int[] nums2 = {1, 2, 3};
        System.out.println("Input: [1,2,3]");
        System.out.println("Output: " + bubbleSortSwapCount(nums2));
    }
}
