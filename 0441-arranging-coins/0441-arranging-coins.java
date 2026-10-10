class Solution {
    public int arrangeCoins(int n) {
        int low=1;
        int high=n;
      
        while(low<=high)
        {
        int mid=low+(high-low)/2;
       long coinr = (long) mid * (mid + 1) / 2;
         if(coinr==n)
         {  
            return mid;
         }   
         else if(coinr<n)
         {
            low=mid+1;
         }
         else
         {
            high=mid-1;
         }
        }
        return high;
        
    }
}