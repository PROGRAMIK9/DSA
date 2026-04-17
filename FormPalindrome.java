class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        int odd = 0;
        int[] hash = new int[26];
        for(char c: s.toCharArray()){
            hash[c - 'a']++;
        }
        for(int i: hash){
            if(i % 2 != 0){
                odd++;
                if(odd > 1) return false;
            }
        }
        return true;
    }
}