class Solution {
    public long minCost(int[] heights, int[] cost) {
        // code here
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for(int h :heights){
            left = Math.min(left,h);
            right = Math.max(right,h);
        }
        long min = getCost(heights,cost,left);
        while(left<=right){
            int m1 = left + (right - left) / 3;
            int m2 = right - (right -left) / 3;
            long cost1 = getCost(heights,cost,m1);
            long cost2 = getCost(heights,cost,m2);
            min = Math.min(min, Math.min(cost1,cost2));
            if(cost1<cost2){
                right = m2-1;
            }else{
                left = m1+1;
            }
        }
        return min;
    }
    private long getCost(int[] heights, int[] cost, int target){
        long total = 0;
        for(int i=0;i<heights.length;i++){
            total+=(long)Math.abs(heights[i]-target)*cost[i];
        }
        return total;
    }
}
