/*283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0] */
/*class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;

        // Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx++] = nums[i];
            }
        }

        // Fill remaining positions with zeros
        while (idx < nums.length) {
            nums[idx++] = 0;
        }
    }
}
 */
/*Time Complexity:
👉 O(n) — we traverse the array once.

Space Complexity:
👉 O(1) — in-place, no extra data structures used. */