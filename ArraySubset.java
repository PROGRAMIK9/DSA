
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x:a){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        for(int x:b){
            if(!freq.containsKey(x) || freq.get(x) == 0){
                return false;
            }
            freq.put(x,freq.get(x)-1);
        }
        return true;
    }
}