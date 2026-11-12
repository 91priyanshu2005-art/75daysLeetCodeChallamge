/*class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even=0;
        int odd=1;
        int arr[]=new int[nums.length];
        for(int i=0;i<arr.length;i++)
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
    */
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            if (nums[low] % 2 == 0) {
                low++;
            }
            else if (nums[high] % 2 != 0) {
                high--;
            }
            else {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;

                low++;
                high--;
            }
        }

        return nums;
    }
}