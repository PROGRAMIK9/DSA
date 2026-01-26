class Solution {
    static ArrayList<ArrayList<Integer>> res;
    public static void solve(int[] arr, boolean[] used, ArrayList<Integer> curr){
        if(curr.size() == arr.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i= 0;i<arr.length;i++){
            if(!used[i]){
                curr.add(arr[i]);
                used[i]=true;
                solve(arr,used,curr);
                used[i]=false;
                curr.remove(curr.size()-1);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        res =  new ArrayList<>();
        boolean used[] = new boolean[arr.length];
        solve(arr,used, new ArrayList<>());
        return res;
    }
};