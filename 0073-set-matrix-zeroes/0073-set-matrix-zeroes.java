class Solution {
    public void setZeroes(int[][] arr) {
       int row=arr.length;
       int col=arr[0].length;

       int temp[] =new int[row];
       int gap[]=new int [col];

       for(int i=0;i<row;i++)
       {
        for(int j=0;j<col;j++)
        {
            if(arr[i][j]==0)
            {
                temp[i]=1;
                gap[j]=1;
            }
        }
       }
       for(int i=0;i<row;i++)
       {
        for(int j=0;j<col;j++)
        {
            if(temp[i]==1 || gap[j]==1)
            {
                arr[i][j]=0;
            }
        }
       }
    }
}