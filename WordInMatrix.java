class Solution {
    public boolean isWordExist(char[][] mat, String word) {
        // Code here
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                //Find the frist character that matches.
                if(mat[i][j] == word.charAt(0)){
                    //now try to find if there is a full match(returns true or false)
                    if(find(mat,i,j,0,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean find(char[][] mat, int row, int col, int idx, String word){
        //base condition -  if idx is of word length we found the word
        if(idx == word.length()){
            return true;
        }
        int n = mat.length;
        int m = mat[0].length;
        //if row or col is beyond bounds its not possible to find the word here
        if(row<0||col<0||row>=n||col>=m){
            return false;
        }
        //if the char is not equal then its not a match
        if(mat[row][col]!=word.charAt(idx)){
            return false;
        }
        char temp = mat[row][col];
        //used once so replace it with #
        mat[row][col]='#';
        //find all the occurences up down left right
        boolean result = find(mat,row+1,col,idx+1,word)||find(mat,row-1,col,idx+1,word)||find(mat,row,col+1,idx+1,word)||find(mat,row,col-1,idx+1,word);
        //wither found or not found so revert the value of the #'s back to their values.'
        mat[row][col]=temp;
        return result;
    }
}