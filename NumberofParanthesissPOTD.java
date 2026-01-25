class Solution {
    int findWays(int n) {
        // code here
        if(n%2!=0) return 0;
        return valid(0,0,0,n);
    }
    int valid(int pos,int l,int r, int n){
        if(n==pos){
            if(l>r)return 1;
            else return 0;
        }
        if(l>n/2) return 0;
        if(r>l) return 0;
        return valid(pos+1,l+1,r,n)+valid(pos+1,l,r+1,n);
    }
}
Number of 