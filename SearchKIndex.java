class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int n = arr.length;
        int i=0;
        for(;i<n;i++){
            if(arr[i]==k){
                return i;
            }
            if(arr[i]>k) return i;
        }
        return i;
    }
}                                  