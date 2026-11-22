class Solution {
public String frequencySort(String s) {

    int freq[] = new int[128];

    // Count frequency
    for(int i = 0; i < s.length(); i++)
    {
        char ch = s.charAt(i);
        freq[ch]++;
    }

    // Store characters according to frequency
    StringBuilder ans = new StringBuilder();

    for(int i = 0; i < s.length(); i++)
    {
        char maxChar = 0;
        int maxFreq = 0;

        for(int j = 0; j < 128; j++)
        {
            if(freq[j] > maxFreq)
            {
                maxFreq = freq[j];
                maxChar = (char)j;
            }
        }

        for(int k = 0; k < maxFreq; k++)
        {
            ans.append(maxChar);
        }

        freq[maxChar] = 0;
    }

    return ans.toString();
}

}