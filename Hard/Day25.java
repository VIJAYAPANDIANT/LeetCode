/*25. Reverse Nodes in k-Group
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
Example 2:


Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5] */
/*class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;

        // Step 1: Check if there are at least k nodes
        ListNode curr = head;
        int count = 0;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        // If less than k nodes, return head as it is
        if (count < k) return head;

        // Step 2: Reverse first k nodes
        curr = head;
        ListNode prev = null;
        ListNode next = null;
        count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Step 3: Recursively reverse remaining nodes
        head.next = reverseKGroup(curr, k);

        // prev is the new head after reversal
        return prev;
    }
}
 */
/*🔹 Time & Space Complexity

Time: O(n)

Space: O(n / k) (recursive stack) */