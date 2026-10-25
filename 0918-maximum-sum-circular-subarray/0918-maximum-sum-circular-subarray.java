class Solution {
    public int maxSubarraySumCircular(int[] arr) {
       int totalSum = 0; 
       int maxSum = arr[0]; 
       int minSum = arr[0]; 
       int currentMax = 0;
        int currentMin = 0;
        for(int num  :arr)
        {
            currentMax=Math.max(num,currentMax+num);
            maxSum=Math.max(maxSum,currentMax);

            currentMin=Math.min(num,currentMin+num);
            minSum=Math.min(currentMin,minSum);

            totalSum+=num;

        }
        if(maxSum<0)
        {
            return maxSum;
        }
        int circularSum=totalSum-minSum;
        return Math.max(maxSum, circularSum);


    }
}