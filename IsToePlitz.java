class Solution {
    public boolean isToeplitz(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i!=0 && j!=0){
                    if(mat[i][j]!=mat[i-1][j-1])return false;
                }
                
            }
        }
        return true;
    }
}
