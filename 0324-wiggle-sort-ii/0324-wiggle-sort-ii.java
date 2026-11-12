/*import java.util.Arrays;
class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        int left=(n-1)/2;
        int right=n-1;
        int arr[]=new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                arr[i]=nums[left];
                left--;
            }
            else
            {
                arr[i]=nums[right];
                right--;
            }
        }
      
    }
}*/
import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;

        int left = (n - 1) / 2;
        int right = n - 1;

        int arr[] = new int[n];

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = nums[left];
                left--;
            }
            else {
                arr[i] = nums[right];
                right--;
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}