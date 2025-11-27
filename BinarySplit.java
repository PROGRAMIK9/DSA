// User function Template for Java

class Solution {
    public static int maxSubStr(String str) {
        // Write your code here
        int count0 = 0;
        int count1 = 0;
        int ans =0;
        for(char ch : str.toCharArray()){
            if(ch=='0'){
                count0++;
            }else{
                count1++;
            }
            if(count0==count1 && (count1!=0 && count0!=0))ans++;
        }
        if(count1!=count0)return -1;
        return ans;
    }
}