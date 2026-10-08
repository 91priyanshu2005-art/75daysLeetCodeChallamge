
class Solution {

    public int[][] matrixReshape(int[][] arr, int r, int c) {

        int multi = r * c;
        int add = arr.length * arr[0].length;

        if (multi != add) {
            return arr;
        }

        int result[][] = new int[r][c];

        int a = 0;
        int b = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                result[a][b] = arr[i][j];

                b++;

                if (b == c) {
                    b = 0;
                    a++;
                }
            }
        }

        return result;
    }
}



