
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        if(arr.length==1) return false;
        Arrays.sort(arr);
        int i=0,j=1, n = arr.length;
        while(j<n && i<n){
            int diff = Math.abs(arr[j]-arr[i]);
            if(diff == x && i!=j) return true;
            else if(diff > x){
                i++;
            }else{
                j++;
            }
        }
        return false;
    }
}
