class Solution {
 public char findTheDifference(String s, String t) {
    int freq[]=new int[26];
    int temp[]=new int[26];
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        freq[ch-'a']++;
      }
       for(int i=0;i<t.length();i++)
      {
        char sh=t.charAt(i);
        temp[sh-'a']++;
      }
      for(int i=0;i<26;i++)
      {
        if(temp[i]!=freq[i])
        {
            return (char)(i+'a');// this was possible  made me error once
        }
      }
      return ' ';//this was i missing 
    }
}