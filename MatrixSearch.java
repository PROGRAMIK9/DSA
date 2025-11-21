class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rows = 0, col =n-1;
        while(rows<m && col>-1){
            int curr = matrix[rows][col];
            if(curr==target) return true;
            else if(curr<target) rows++;
            else col--;
        }
        return false;
    }
}