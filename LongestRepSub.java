// User function Template for Java

class Solution {
    // using recursion
    //public int check(int i, int j, String a, String b){
    //     if(i<0 || j<0) return 0;
    //     if(a.charAt(i) == b.charAt(j)&& i!=j){
    //         return 1+ check(i-1,j-1,a,b);
    //     }
    //     return Math.max(check(i-1,j,a,b), check(i,j-1,a,b));
    // }
    //dp and recursion.
    public int check(int i, int j, String a, String b, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j) && i!=j){
            return dp[i][j] = 1+check(i-1,j-1,a,b,dp);
        }
        return dp[i][j] = Math.max(check(i-1,j,a,b,dp), check(i,j-1,a,b,dp)); 
    }
    public int LongestRepeatingSubsequence(String s) {
        // recursion
        // int n = s.length();
        // String b = s;
        // return check(n-1,n-1,s,b);
        //dp and recursion
        // int n = s.length();
        // String b = s;
        // int[][] dp = new int[n][n];
        // for(int i=0;i<n;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // return check(n-1,n-1,s,b,dp);
        int n = s.length();
        String b = s;
        int[][] dp = new int[n+1][n+1];
        // for(int i=0;i<n;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==s.charAt(j-1)&&i!=j){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}