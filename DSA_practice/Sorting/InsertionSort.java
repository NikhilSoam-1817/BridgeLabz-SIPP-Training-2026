package DSA_practice;

public class InsertionSort {
    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {12, 11, 13, 5, 6};
        System.out.println("Sorted: " + java.util.Arrays.toString(insertionSort(nums1)));
        
        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println("Sorted: " + java.util.Arrays.toString(insertionSort(nums2)));
    }
}
