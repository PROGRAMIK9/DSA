class Solution {
    public int findSubarray(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int val = entry.getValue();
            if(entry.getKey() == 0){
                ans += (val*(val+1))/2;
            }else{
                ans += (val*(val-1))/2;
            }
        }
        return ans;
    }
}
