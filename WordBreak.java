class Solution {
    public boolean solve(int i, String s, Map<String,Boolean> mp, int[] dp, int mxlim){
        int n = s.length();
        if(i==n) return true;
        if(dp[i]!=-1){
            return dp[i]==1?true:false;
        }
        for(int j=i;j<=Math.min((i+mxlim),n);j++){
            String substr = s.substring(i,j);
            if(mp.containsKey(substr)){
                boolean res = solve(j,s,mp,dp,mxlim);
                dp[i]=res?1:0;
                if(res) return true;
            }
        }
        dp[i]=0;
        return false;
    }
    public boolean wordBreak(String s, String[] dictionary) {
        int mxlim =0;
        Map<String, Boolean> dict = new HashMap<>();
        for(String str : dictionary){
            dict.put(str, true);
            mxlim = Math.max(mxlim,str.length());
        }
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return solve(0,s,dict,dp,mxlim);
    }
}