class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int mid=0;
        int even=0;
        int odd =1;
        int arr[]=new int [nums.length];
        for(int i=0;i<nums.length;i++)
       {
        if(nums[i]%2==0)
        {
            arr[even]=nums[i];
            even=even+2;
        }
        else
        {
            arr[odd]=nums[i];
            odd=odd+2;
        }

       }
       return arr; 
        
    }
}