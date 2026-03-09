class Solution {
    public String largestSwap(String s) {
        // code here
        int n = s.length();
        boolean diff = false;
        int id = -1;
        for(int i = 0;i<n-1;i++){
            if(s.charAt(i)<s.charAt(i+1)){
                id=i+1;
                diff=true;
                break;
            }
        }
        if(!diff) return s;
        char c = '0';
        int si = -1;
        for(int i =id;i<n;i++){
            if(s.charAt(i)>=c){
                c=s.charAt(i);
                si=i; 
            }
        }
        StringBuilder sb=new StringBuilder(s);
        
        for(int i=0;i<id;i++){
            if(c>s.charAt(i)){
                sb.setCharAt(i,s.charAt(si));
                sb.setCharAt(si,s.charAt(i));
                break;
            }
        }
        
        return sb.toString();
    }
}