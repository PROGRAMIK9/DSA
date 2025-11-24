class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";
        String prev = countAndSay(n-1);
        return rle(prev);
    }
    String rle(String s){
        int i =1;
        int start =0;
        StringBuffer sb = new StringBuffer();
        int n = s.length();
        while(i<n){
            if(s.charAt(i)==s.charAt(i-1)){

            }else{
                sb.append(i-start+""+s.charAt(i-1));
                start = i;
            }
            i++;
        }
            sb.append(i-start+""+s.charAt(i-1));
        return sb.toString();
    }
}