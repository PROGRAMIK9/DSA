class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        if(k>arr.length){
            return 0;
        }
        int max_sum = 0,curr_sum=0;
        for(int i=0;i<k;i++){
            curr_sum +=arr[i];
            max_sum = curr_sum;
        }
        int i=k,start=0;
        while(i<arr.length){
            curr_sum = curr_sum - arr[start++] + arr[i++];
            max_sum = max_sum>curr_sum?max_sum:curr_sum;
        }
        return max_sum;
    }
}