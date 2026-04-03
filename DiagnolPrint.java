class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int col=0;col<mat.length;col++){
            int i =0, j = col;
            while(i<mat.length && j>=0){
                arr.add(mat[i][j]);
                i++;
                j--;
            }
        }
        for(int row = 1; row < mat.length; row++) {
            int i = row, j = mat.length - 1;
            while(i < mat.length && j >= 0) {
                arr.add(mat[i][j]);
                i++;
                j--;
            }
        }
        return arr;
        
    }
}
