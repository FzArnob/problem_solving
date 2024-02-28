package leetcode.remove_element;

public class Solution_1 {
    // https://leetcode.com/problems/remove-element/
    public int removeElement(int[] nums, int val) {
        int occurrences = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                occurrences++;
            } else if(i != 0){
                nums[i-occurrences] = nums[i];
            }
        }
        return nums.length - occurrences;
    }
}
