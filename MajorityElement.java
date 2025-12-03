class Solution {
    int majorityElement(int arr[]) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>arr.length/2) return arr[i];
        }
        return -1;
    }
}