// User function Template for Java

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        for(int i = 2; i<=n;i++){
            multiply(i,a);
        }
        Collections.reverse(a);
        return a;
    }
    public static void multiply(int n, ArrayList<Integer> a){
        int carry =0;
        for(int i=0;i<a.size();i++){
            int prod = a.get(i)*n+carry;
            a.set(i, prod%10);
            carry = prod/10;
        }
        while(carry!=0){
            a.add(carry%10);
            carry/=10;
        }
    }
}