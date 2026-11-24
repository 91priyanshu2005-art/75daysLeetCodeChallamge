/*class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        for(int i = 0; i <= n - m; i++) {

            int j = 0;//is to reall increase if we found the common 
            // Compare characters
            while(j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If all characters match
            if(j == m) {
                return i;
            }
        }

        return -1;
    }
}*/
class Solution {

    // Function to calculate LPS array
    public void computeLPS(String pattern, int m, int lps[]) {

        int len = 0;
        int i = 1;

        lps[0] = 0;

        while (i < m) {

            if (pattern.charAt(i) == pattern.charAt(len)) {

                len++;
                lps[i] = len;
                i++;
            }
            else {

                if (len != 0) {
                    len = lps[len - 1];
                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        int lps[] = new int[m];

        computeLPS(needle, m, lps);

        int i = 0;
        int j = 0;

        while (i < n) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                return i - j;
            }

            else if (i < n && haystack.charAt(i) != needle.charAt(j)) {

                if (j != 0) {
                    j = lps[j - 1];
                }
                else {
                    i++;
                }
            }
        }

        return -1;
    }
}