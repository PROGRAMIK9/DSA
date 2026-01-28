class Solution {
    private int solve(int[] arr, int k, int idx, HashMap<List<Integer>,Integer> map){
        if(k == 0) return 1;
        if(k<0 || idx >= arr.length) return 0;
        List<Integer> key = Arrays.asList(idx,k);
        if(map.containsKey(key)){
            return map.get(key);
        }
        int ans =  solve(arr,k-arr[idx],idx+1,map) + solve(arr,k,idx+1,map);
        map.put(key,ans);
        return ans;
    }
    public int countSubset(int[] arr, int k) {
        // code here
        long sum = Arrays.stream(arr).sum();
        if(k>sum)return 0;
        Arrays.sort(arr);
        HashMap<List<Integer>,Integer> map = new HashMap<>();
        return solve(arr,k,0,map);
    }
}
