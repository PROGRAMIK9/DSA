// User function Template for Java
class Solution {
    String printSequence(String S) {
        // code here
        String output="";
        for(char s:S.toCharArray()){
            if(s==' '){
                output+=("0");
            }else{
                int position = s-'A';
                output+=getValue(position);
            }
        }
        return output;
    }
    String getValue(int pos){
        String[] arr = {"2","22","222","3","33",
            "333","4","44","444","5","55","555",
            "6","66","666","7","77","777","7777","8",
            "88","888","9","99","999","9999"
        };
        return arr[pos];
    }
}