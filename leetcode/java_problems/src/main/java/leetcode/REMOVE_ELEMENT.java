package leetcode;

import leetcode.remove_element.Solution_1;

import static leetcode.HELPER.printArray;

public class REMOVE_ELEMENT {
    public static void main(String[] args) {
        // Example 2
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        System.out.println("Before removing: ");
        printArray(nums);

        // solution1 is better
        Solution_1 solution1 = new Solution_1();
        System.out.println(solution1.removeElement(nums, val));
        // Solution_2 solution2 = new Solution_2();
        // System.out.println(solution2.removeElement(nums, val));

        System.out.println("After removing: ");
        printArray(nums);
    }
}
