class Solution {
    public static int findMaxValue(int n, int[][] mat) {
        // code here
        int [][] matMax = new int[n][n];
        matMax[n-1][n-1] = mat[n-1][n-1];
        for(int i=n-2;i>=0;i--){
            matMax[n-1][i] = Math.max(matMax[n-1][i+1],mat[n-1][i]);
            matMax[i][n-1] = Math.max(matMax[i+1][n-1],mat[i][n-1]);
        }
        for(int i =n-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                int max_sum = Math.max(mat[i][j],matMax[i+1][j]);
                matMax[i][j] = Math.max(max_sum, matMax[i][j+1]);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                max = Math.max(max, matMax[i+1][j+1]-mat[i][j]);
            }
        }
        return max;
    }
}
