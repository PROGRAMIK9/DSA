class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n = arr.length;
        int rep = n/3;
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>rep && !res.contains(arr[i])) res.add(arr[i]);
        }
        return res;
    }
}
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n = arr.length;
        int rep = n/3;
        Arrays.sort(arr);
        int c =1;
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i]){
                c++;
                if(c>rep && !res.contains(arr[i])) res.add(arr[i]);
            }else{
                c=1;
            }
        }
        return res;
    }
}