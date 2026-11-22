class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int [26];
    int temp[]=new int [26];
    for(int i=0;i<ransomNote.length();i++)//this must be added seprately
    {
        char ch =ransomNote.charAt(i);
        freq[ch-'a']++;
    }
    for(int i=0;i<magazine.length();i++)
    {
        char sh =magazine.charAt(i);
        temp[sh-'a']++;
    }    
        for(int i=0;i<26;i++)
        {
            if(freq[i]>temp[i])
            {
                return false;
            }
           
        }
        return true;
    }
       
}