class Solution {
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int h =0, n = citations.length;
        for(int i=n-1;i>=0;i--){
            if(citations[i]>=n-i){
                h=n-i;
            }else{
                break;
            }
        }
        return h;
    }
}