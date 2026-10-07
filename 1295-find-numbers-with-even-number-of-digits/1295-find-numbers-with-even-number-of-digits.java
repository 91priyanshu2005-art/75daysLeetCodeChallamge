class Solution {
    public int findNumbers(int[] arr) {

        int temp = 0;
        int add = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            while (arr[i] != 0) {

                temp = arr[i] % 10;
                count++;
                arr[i] = arr[i] / 10;
            }

            if (count % 2 == 0) {
                add++;
            }
        }

        return add;
    }
}