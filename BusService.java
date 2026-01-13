class Solution {
    public boolean canServe(int[] arr) {
        // code here
        int five=0,ten=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5){
                five++;
            }
            else if(arr[i]==10){
                ten++;
                if(five>=1) five--;
                else return false;
            }else{
                if(five>=1 && ten>=1){ five--;ten--;}
                else if(five>=3){five-=3;}
                else return false;
            }
        }
        return true;
    }
}