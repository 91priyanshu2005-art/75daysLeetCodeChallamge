class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] arr = new int[101];

        for (int[] log : logs) {
            arr[log[0] - 1950]++;
            arr[log[1] - 1950]--;
        }

        int population = 0;
        int maxPopulation = 0;
        int year = 1950;

        for (int i = 0; i < 101; i++) {
            population += arr[i];

            if (population > maxPopulation) {
                maxPopulation = population;
                year = i + 1950;
            }
        }

        return year;
    }
}