class Solution {
    public int[] stableMarriage(int[][] men, int[][] women) {
        // code here
        int n = men.length;
        int res[] = new int[n];
        int[] partner =  new int[n];
        Arrays.fill(partner,-1);
        int[] next = new int[n];
        int[][] rank = new int[n][n];
        for(int w=0;w<n;w++){
            for(int i=0;i<n;i++){
                rank[w][women[w][i]] = i;
            }
        }
        Queue<Integer> freeMen = new LinkedList<>();
        for(int i=0;i<n;i++){
            freeMen.add(i);
        }
        while(!freeMen.isEmpty()){
            int man = freeMen.poll();
            int woman = men[man][next[man]];
            next[man]++;
            if(partner[woman]==-1){
                partner[woman] = man;
                res[man] = woman;
            }else{
                int currMan = partner[woman];
                if(rank[woman][man]<rank[woman][currMan]){
                    partner[woman]=man;
                    res[man] = woman;
                    freeMen.add(currMan);
                }
                else{
                    freeMen.add(man);
                }
            }
        }
        return res;
    }
}