class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int i =0;
        int j = n-1;
        int ans = 0;
        int max = 0;
        while(i<j){
            int min = Math.min(arr[i],arr[j]);
            max = Math.max(max, min);
            if(arr[i]<arr[j]){
                ans+=(max-arr[i]);
                i++;
            }else{
                ans+=(max-arr[j]);
                j--;
            }
        }
        return ans;
    }
}
Tra