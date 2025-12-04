class Solution {
    public int rob(int[] arr, int i, int[] dp){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        int max;
        int option1 = arr[i]+rob(arr, i+2,dp);
        int option2 = rob(arr,i+1,dp);
        max = Math.max(option1,option2);
        return dp[i] = max;
    }
    public int findMaxSum(int arr[]) {
        // code here
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return rob(arr,0,dp);
    }
}