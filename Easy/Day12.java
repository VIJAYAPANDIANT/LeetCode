/*28. Find the Index of the First Occurrence in a String
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1. */
/*public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
} */
/*public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        int n = haystack.length();
        int m = needle.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            if(j==m) return i;
        }
        return -1;
    }
} */ /*class Solution {
    public int strStr(String haystack, String needle) {
    
        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
} */
