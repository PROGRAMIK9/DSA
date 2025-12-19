class Solution {
    public int findMoves(int[] chairs, int[] passengers) {
        // code here
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        int csum = 0;
        for(int i=0;i<chairs.length;i++){
            csum += Math.abs(chairs[i]-passengers[i]);
        }
        return csum;
    }
}
