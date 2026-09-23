class Solution {
    public int maxSum(int[] num1, int[] num2) {
        long A = 0;
        long B = 0;
        long total = 0;
        int i = 0;
        int j = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) {
                A = A + num1[i];
                i++;
            } else if (num1[i] > num2[j]) {
                B = B + num2[j];
                j++;
            } else {
                total = total + Math.max(A, B)+num1[i];
                A = 0;
                B = 0;
                i++;
                j++;

            }
        }

        while (i < num1.length) {
            A = A + num1[i];
            i++;
        }
        while (j < num2.length) {
            B = B + num2[j];
            j++;
        }

        
        return (int)((total + Math.max(A, B)) % 1000000007);

    }
}