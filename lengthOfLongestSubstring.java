/***

Given a string s, find the length of the longest substring without repeating characters.


Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.


Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.


Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

***/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        String subString;
        int largestSubstringLength = 0;
        
        for (int i = 0; i < s.length(); i++){
            subString = String.valueOf(s.charAt(i));
            
            for (int j = i + 1; j < s.length(); j++){
                
                if ( s.charAt(i) != s.charAt(j) && !subString.contains(String.valueOf(s.charAt(j))) ){
                    subString = subString + String.valueOf(s.charAt(j));
                }else{
                    break;
                }
            }
            // System.out.println(subString);
            if (largestSubstringLength < subString.length()){
                largestSubstringLength = subString.length();
            }
        }
        
        return largestSubstringLength;
    }
}
