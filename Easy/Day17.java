/*67. Add Binary
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101" */
/*class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            
            result.append(sum % 2); // append current bit
            carry = sum / 2;        // update carry
            
            i--;
            j--;
        }

        return result.reverse().toString(); // reverse to get correct order
    }
}
 */
/*Time Complexity: O(n)
Space Complexity: O(n)
where n is the length of the longer string between a and b. */