class Solution {
    public int maximumSum(int[] arr) {

        int oneDelet = 0;
        int noDelet = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            oneDelet = Math.max(noDelet, oneDelet + arr[i]);

            noDelet = Math.max(arr[i], noDelet + arr[i]);

            ans = Math.max(ans, Math.max(noDelet, oneDelet));
        }

        return ans;
    }
}