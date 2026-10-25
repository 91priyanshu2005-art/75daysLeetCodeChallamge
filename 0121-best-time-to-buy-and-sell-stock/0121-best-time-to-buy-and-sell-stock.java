class Solution {
    public int maxProfit(int[] arr) {
        int buy = arr[0];
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            int sell = arr[i];

            if (sell - buy > profit) {
                profit = sell - buy;
            }

            if (sell < buy) {
                buy = sell;
            }
        }

        return profit;
    }
}