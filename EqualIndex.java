// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==i+1){
                res.add(i+1);
            }
        }
        return res;
    }
}