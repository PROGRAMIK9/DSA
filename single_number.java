
class single_number {
    public int singleNumber(int[] nums) {
        int res =0;
        for(int n:nums){
            res ^= n;
       }
       return res;
    }
}