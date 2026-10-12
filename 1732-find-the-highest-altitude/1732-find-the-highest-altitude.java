class Solution {
    public int largestAltitude(int[] arr) {
        int maxgain=0;
        int maxaltitiude=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            maxaltitiude=maxaltitiude+arr[i];
            if(maxgain<maxaltitiude)
            {
                maxgain=maxaltitiude;
        }

        }
        return maxgain;
        
    }
}