package leetcode.majority_element;

public class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int m = 0;
        for (int x : nums) {
            if (c == 0) {
                m = x;
                c = 1;
            } else if (x == m)
                c++;
            else
                c--;
        }
        return m;
    }
}
