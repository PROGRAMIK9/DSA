class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=arr.length;i++){
            map.put(i,1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                map.put(arr[i],map.get(arr[i])-1);
            }else{
                res.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1) res.add(arr[i]);
        }
        return res;
    }
}
