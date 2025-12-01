// User function Template for Java

class Solution {
    static int countSquares(int n) {
        // code here
        int c=0;
        for(int i=1;i<Math.sqrt(n);i++){
            c++;
        }
        return c;
    }
}