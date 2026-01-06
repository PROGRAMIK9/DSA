class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int n = arr.length;
        int curr_sum = 0;
        int max_sum = 0;
        for(int i=0;i<k;i++){
            curr_sum = curr_sum ^ arr[i];
            max_sum = curr_sum;
        }
        int start = 0;
        int i=k;
        while(i<arr.length){
            curr_sum = curr_sum ^ arr[start++] ^ arr[i++];
            max_sum = curr_sum > max_sum ? curr_sum:max_sum;
       }
       return max_sum;
    }
}
