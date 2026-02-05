class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int n = arr.length;
        int i = 0,j = 0,ans = 0;
        while(j<n){
            if(arr[j++]==0){
                k--;
            }
            while(k<0){
                if(arr[i++] == 0){
                    k++;
                }
            }
            ans = Math.max(ans,j-i);
        }
        return ans;
    }
}