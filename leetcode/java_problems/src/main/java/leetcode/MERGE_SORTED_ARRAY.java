package leetcode;

import leetcode.merge_sorted_array.Solution;

import static leetcode.HELPER.printArray;

public class MERGE_SORTED_ARRAY {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        System.out.println("Before merging: ");
        printArray(nums1);
        printArray(nums2);

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);

        System.out.println("After merging: ");
        printArray(nums1);
        printArray(nums2);
    }
}
