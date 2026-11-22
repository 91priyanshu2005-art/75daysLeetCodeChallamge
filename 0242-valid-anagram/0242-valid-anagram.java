class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
    int freq[]=new int [26];
    int temp[]=new int [26];
    for(int i=0;i<s.length();i++)
    {
        char ch =s.charAt(i);
        freq[ch-'a']++;
        char sh =t.charAt(i);
        temp[sh-'a']++;
    }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=temp[i])
            {
                return false;
            }
           
        }
        return true;
    }
}