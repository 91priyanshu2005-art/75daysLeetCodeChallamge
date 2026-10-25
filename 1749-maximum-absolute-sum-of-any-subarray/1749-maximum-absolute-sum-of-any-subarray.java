/**class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int num=arr[0];
        int abs=0;
        int sum=0;
        int max=0;

        for(int i=1;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum<0)
            {
                abs=sum*(-1);
            }
            if(abs>max)
            {
                max=abs;
            }
        }
        return num;
        
    }
} */
class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int maxEnding = 0;
        int minEnding = 0;
        int maxSum = 0;
        int minSum = 0;

        for (int i = 0; i < arr.length; i++) {
            maxEnding = Math.max(0, maxEnding + arr[i]);
            minEnding = Math.min(0, minEnding + arr[i]);

            maxSum = Math.max(maxSum, maxEnding);
            minSum = Math.min(minSum, minEnding);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}