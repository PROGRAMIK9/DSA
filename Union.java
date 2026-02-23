class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int aitem: a){
            set.add(aitem);
        }
        for(int bitem: b){
            set.add(bitem);
        }
        for(int item:set){
            res.add(item);
        }
        return res;
    }
}