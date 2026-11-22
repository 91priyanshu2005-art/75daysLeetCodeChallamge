class Solution {
    public int longestPalindrome(String s) {

        int freq[] = new int[128];

        // Frequency counting
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        int count = 0;
        boolean odd = false;

        // Calculate palindrome length
        for (int i = 0; i < 128; i++) {

            if (freq[i] % 2 == 0) {
                count += freq[i];
            }
            else {
                count += freq[i] - 1;
                odd = true;
            }
        }

        if (odd) {
            count++;
        }

        return count;
    }
}