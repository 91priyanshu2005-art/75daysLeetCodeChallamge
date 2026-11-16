class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int currentSum=0;
        int temp=0;
        for(int i=0;i<k;i++)
        {
            currentSum=currentSum+arr[i];
        }
        if(currentSum / k >= threshold)
    {
        temp++;
    }
        for(int i=k;i<arr.length;i++)
        { 
            
            currentSum=currentSum+arr[i]-arr[i-k];
           
            if((currentSum/k)>=threshold)
            {
               temp++;
            }
        }
        return temp;
    }
}