package JavaStrings;

//Time Complexity :-O(n)
//Space Complexity:-O(1)

public class Most_Frequent_Chracter {
    public char getMaxOccuringChar(String s) {

        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 97;
            freq[idx]++;
        }

        int maxfreq = -1;
        char ch = s.charAt(0);

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxfreq) {
                maxfreq = freq[i];
                ch = (char) (i + 97);
            }

        }
        return ch;
    }
}
