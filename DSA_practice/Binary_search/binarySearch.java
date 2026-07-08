class BinarySearchExamples {
    // Classic binary search on sorted array. Returns index or -1.
    static int binarySearch(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == target) return m;
            if (a[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    // Search target in rotated sorted array. Returns index or -1.
    static int searchInRotated(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == target) return m;
            // left half sorted
            if (a[l] <= a[m]) {
                if (a[l] <= target && target < a[m]) r = m - 1;
                else l = m + 1;
            } else { // right half sorted
                if (a[m] < target && target <= a[r]) l = m + 1;
                else r = m - 1;
            }
        }
        return -1;
    }

    // First occurrence of target in sorted array (may have duplicates)
    static int firstOccurrence(int[] a, int target) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] >= target) {
                if (a[m] == target) ans = m;
                r = m - 1;
            } else l = m + 1;
        }
        return ans;
    }

    // Last occurrence of target in sorted array
    static int lastOccurrence(int[] a, int target) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] <= target) {
                if (a[m] == target) ans = m;
                l = m + 1;
            } else r = m - 1;
        }
        return ans;
    }

    // Find minimum in rotated sorted array (no duplicates assumed)
    static int findMinInRotated(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] > a[r]) l = m + 1;
            else r = m;
        }
        return a[l];
    }

    // Quick demonstration
    public static void main(String[] args) {
        int[] sorted = {1,2,3,4,5,6,7};
        int[] rotated = {5,6,7,1,2,3,4};
        int[] dup = {1,2,2,2,3,4};

        System.out.println(binarySearch(sorted, 4)); // 3
        System.out.println(searchInRotated(rotated, 2)); // 4
        System.out.println(firstOccurrence(dup, 2)); // 1
        System.out.println(lastOccurrence(dup, 2)); // 3
        System.out.println(findMinInRotated(rotated)); // 1
    }
}
