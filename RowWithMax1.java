// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int row = -1,col=arr[0].length;
        for(int i=0;i<arr.length;i++){
            int j=0;
            while(j<col){
                if(arr[i][j]==1 && j<col){
                    row=i;
                    col=j;
                    break;
                }
                j++;
            }
        }   
        return row;
    }
}