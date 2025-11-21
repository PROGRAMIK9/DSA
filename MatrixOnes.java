// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int count =0,row=0;
        int maxCount = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>maxCount){
                row=i;
            }
            maxCount = Math.max(count, maxCount);
            count=0;
            
        }
        return row;
    }
}