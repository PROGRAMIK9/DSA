public class Solution {
    int getLPSLength(String s) {
        // code here
        int n = s.length();
          int i = 0, j = 1;
        int pos = j;

        while (j < n) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j++;
            } else {
                i = 0;
                pos++;  // move pos forward
                j = pos; // reset j to new pos
            }
        }
        return i; // return length of matched prefix suffix
    }
} {
    
}
