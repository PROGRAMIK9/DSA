class Solution {
    public int equalSumSpan(int[] a1, int[] a2) {
        // code here
        int n = a1.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int pre = 0;
        int maxl = 0;
        for(int i=0;i<n;i++){
            pre+=(a1[i]-a2[i]);
            if(pre==0){
                maxl=i+1;
            }
            if(map.containsKey(pre)){
                maxl=Math.max(maxl, i-map.get(pre));
            }
            else{
                map.put(pre,i);
            }
        }
        return maxl;
    }
}