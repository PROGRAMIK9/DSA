class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        if(mat.length == 0) return al;
        int rowBegin = 0;
        int rowEnd =mat.length-1;
        int colBegin = 0;
        int colEnd = mat[0].length-1;
        while(rowBegin<=rowEnd && colBegin <= colEnd){
            for(int i = colBegin;i<=colEnd;i++){
                al.add(mat[rowBegin][i]);
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                al.add(mat[i][colEnd]);
            }
            colEnd--;
            if(rowBegin<=rowEnd){
                for(int i =colEnd; i>=colBegin;i--){
                    al.add(mat[rowEnd][i]);
                }
                rowEnd--;
            }
            if(colBegin<=colEnd){
                for(int i = rowEnd; i>= rowBegin; i--){
                    al.add(mat[i][colBegin]);
                }
                colBegin++;
            }
        }
        return al;
    }
}
