/**class Solution {
    public int maxProduct(int[] arr) {
        int max=arr[0];
        int multi=1;
        for(int i=0;i<arr.length;i++)
        {
            multi=multi*arr[i];
            if(multi>max)
            {
                max=multi;
            }
            if(multi<0)
            {
                multi=arr[i];
            }
        }

        return max;
    }
} */
class Solution {
public int maxProduct(int[] arr) {
    int max = arr[0];
    int multi = arr[0];
    int min = arr[0];

    for (int i = 1; i < arr.length; i++) {

        if (arr[i] < 0) {
            int temp = multi;
            multi = min;
            min = temp;
        }

        multi = Math.max(arr[i], multi * arr[i]);
        min = Math.min(arr[i], min * arr[i]);

        if (multi > max) {
            max = multi;
        }
    }

    return max;
}
}
