class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int max = -100;
        for(int num : arr){
            max = Math.max(num,max);
        }
        boolean[] present = new boolean[max*max+1];
        for(int num : arr){
            present[num*num] = true;
        }
        for(int a = 1;a<=max;a++){
            if(!present[a*a])continue;
            for(int b = a+1;b<=max;b++){
                 if(!present[b*b])continue;
                 int csq = a*a + b*b;
                 if(csq>max*max)continue;
                 if(present[csq]){
                     return true;
                 }
            }
        }
        return false;
    }
}