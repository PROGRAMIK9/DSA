class Solution {
    public int countPartitions(int[] arr, int d) {
        // code here
        int total = 0, n = arr.length;
        for(int i=0;i<n;i++){
            total += arr[i];
        }
        if(total<d||(total+d)%2!=0) return 0;
        int subtotal = (total + d)/2;
        int dp[] = new int[subtotal+1];
        dp[0]=1;//only one way
        for(int num : arr){
            for(int j=subtotal;j>=num;j--){
                dp[j] += dp[j-num];
            }
        }
        return dp[subtotal];
    }
}
