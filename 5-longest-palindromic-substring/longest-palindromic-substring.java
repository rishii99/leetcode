class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;
        int start = 0, maxLen = 1;
        for (int i = 0; i < n; i++) {
            int len1 = expand(s, i, i);     // odd
            int len2 = expand(s, i, i + 1); // even
            int len = Math.max(len1, len2);
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }
    private int expand(String s, int left, int right) {
        int n = s.length();
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}