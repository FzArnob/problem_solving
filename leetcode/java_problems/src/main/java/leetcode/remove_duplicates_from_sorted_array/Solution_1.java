package leetcode.remove_duplicates_from_sorted_array;

public class Solution_1 {
    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < k; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) nums[k++] = nums[i];
        }
        return k;
    }
}
