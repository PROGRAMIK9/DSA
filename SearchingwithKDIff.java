// User function Template for Java

class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        // code here
        int i=0;
        
        while(i<arr.length){
            if(x == arr[i]) return i;
            i=i+Math.max(1,Math.abs(arr[i]-x)/k);
        }
        return -1;
    }
}