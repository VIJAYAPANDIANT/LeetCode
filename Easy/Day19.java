//1
/*136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1*/
/*class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR each number
        }
        return result;
    }
}
 */
/*⏱ Time & 🧠 Space Complexity

Time: O(n) → single pass through the array

Space: O(1) → only one variable result used */

//2
/*
Code


961. N-Repeated Element in Size 2N Array
You are given an integer array nums with the following properties:

nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.

 

Example 1:

Input: nums = [1,2,3,3]
Output: 3
Example 2:

Input: nums = [2,1,2,5,3,2]
Output: 2
Example 3:

Input: nums = [5,1,5,2,5,3,5,4]
Output: 5 */
/*class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (!set.add(num)) {
                return num; // first repeated element
            }
        }
        return -1; // never reached
    }
}
 */
/*⏱️ Time & Space Complexity
Metric	Complexity
Time	O(n)
Space	O(n) */