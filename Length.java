class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int i = n-1;
        int count =0;
        while(i>=0){
            if(s.charAt(i) == ' ' && count ==0){i--; continue;}
            if(s.charAt(i) == ' ' && count > 0) break;
            count++; 
            i--;
        }
        return count;
    }
}
