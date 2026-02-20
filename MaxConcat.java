class Solution {
    public String findLargest(int[] arr) {
        // code here
        String[] nums = new String[arr.length];
        
        for(int i=0;i<arr.length;i++){
            nums[i] = String.valueOf(arr[i]);    
        }
        Arrays.sort(nums,(a,b)->(b+a).compareTo(a+b));
        if(nums[0].equals("0"))return "0";
        StringBuilder res = new StringBuilder();
        for(String s:nums){
            res.append(s);
        }
        return res.toString();
    }
}MAx