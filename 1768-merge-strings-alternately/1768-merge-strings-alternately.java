class Solution {
    public String mergeAlternately(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        char arr[] = new char[n + m];

        int k = 0;

        for(int i = 0; i < Math.max(n, m); i++) {

            if(i < n) {
                arr[k] = word1.charAt(i);
                k++;
            }

            if(i < m) {
                arr[k] = word2.charAt(i);
                k++;
            }
        }

        return new String(arr);
    }
}