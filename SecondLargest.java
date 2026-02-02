class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int la =-1, sla = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>la){
                sla = la;
                la = arr[i];
            }else if(arr[i]<la && arr[i]>sla){
                sla = arr[i];
            }
        }
        return sla;
    }
    Arrays.sort(arr);
        int n = arr.length;
        if(n<=1)return -1;
        int largest = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest) return arr[i];
        }
        return -1;
}