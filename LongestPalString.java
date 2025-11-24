
class Solution {
    static String longestPalindrome(String s) {
        int start =0, end =0, maxl=1;
        int n = s.length();
        int l,r;
        for(int i=0;i<n;i++){
            l=i;r =i;
            while(l>=0 && r<n){
                if(s.charAt(l)!=s.charAt(r)) break;
                l--;
                r++;
            }
            int len=(r-l)-1;
            if(len>maxl){maxl = len;start=l+1;end =r;}
        }
        for(int i=0;i<n;i++){
            l=i;r=i+1;
            while(l>=0 && r<n){
                if(s.charAt(l)!=s.charAt(r)) break;
                l--;
                r++;
            }
            int len=(r-l)-1;
            if(len>maxl){maxl = len;start=l+1;end =r;}
        }
        return s.substring(start,end);
    }
}