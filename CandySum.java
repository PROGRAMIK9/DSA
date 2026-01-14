class Solution {
    public int minCandy(int arr[]) {
        // code here
        int mincan =0;
        int []num = new int[arr.length];
        Arrays.fill(num,1);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                num[i] = num[i-1]+1;
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                num[i]=Math.max(num[i],num[i+1]+1);
            }
        }
        for(int c:num){
            mincan+=c;
        }
        return mincan;
    }
}
