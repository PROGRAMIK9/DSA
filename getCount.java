class Solution {
    public boolean check(int n,int d){
        int t = 0;
        int end = n;
        while(end != 0){
            t += end%10;
            end/=10;
        }
        return d<=(n-t);
    }
    public int getCount(int n, int d) {
        // code here
        if(n<10) return 0;
        int count=0;
        int high = n;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(check(mid,d)){
                count = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(count!=0) return n-count+1;
        return 0;
        // for(int i=1;i<=n;i++){
        //     if(i%10 == i) continue;
        //     int num = i;
        //     int t = 0;
        //     while(num!=0){
        //         t+=num%10;
        //         num/=10;
        //     }
        //     if(d<=(i-t)){
        //         count+=n-i+1;
        //         break;
        //     }
        // }
        // return count;
    }
};