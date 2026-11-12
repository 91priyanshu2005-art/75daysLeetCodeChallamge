class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int val[]=new int [26];
        for(int i=0;i<26;i++)
        {
            val[i]=i+1;
        }
        for(int i=0;i<chars.length();i++)
        {
            val[chars.charAt(i)-'a']=vals[i];
        }
        int currentSum=0;
        int maxSum=0;
        for(int i=0;i<s.length();i++)
        {
            int num=val[s.charAt(i)-'a'];
            currentSum=Math.max(0,currentSum+num);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}