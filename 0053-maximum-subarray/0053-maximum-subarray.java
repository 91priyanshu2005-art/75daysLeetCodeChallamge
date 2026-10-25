/**class Solution {
    public int maxSubArray(int[] arr) {
       int currentSum = arr[0];
        int maxSum = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            currentSum+=arr[i];
            if(maxSum<currentSum)
            {
                maxSum=currentSum;
            }
             if (currentSum < 0) {
                currentSum = 0;
            }
            
        }
        return maxSum;
        
    }
} */
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}