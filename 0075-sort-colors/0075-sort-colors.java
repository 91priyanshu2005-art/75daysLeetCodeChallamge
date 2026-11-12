class Solution {
    public void sortColors(int[] arr) {
        int mid=0;
        int low=0;
        int high=arr.length-1;
       while(mid<=high)
       {
        if(arr[mid]==0)
        {
            int temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;

            mid++;
            low++;
        }
        else if(arr[mid]==1)
        {
            mid++;
        }
        else
        {
            int t=arr[mid];
            arr[mid]=arr[high];
            arr[high]=t;

            high--;
        }
       } 
      
    }
}