class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr[arr.length-1]+1;
    }
}