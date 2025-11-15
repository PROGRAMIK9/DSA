class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int len=1;
        int max = Integer.MIN_VALUE;
        int ele = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==ele+1){
                len++;
                ele = arr[i];
            }else if (arr[i]==ele){
                continue;
            }else{
                len = 1;
                ele = arr[i];
            }
            max = Math.max(max,len);
        }
        return max;
    }
}