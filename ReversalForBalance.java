class Solution {
    public int countMinReversals(String s) {
        // code here
        if(s.length()%2!=0) return -1;
        int count =0;
        Stack<Character> stk = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '{'){
                stk.push(ch);
            }else{
                if(!stk.isEmpty() && stk.peek()=='{'){
                    stk.pop();
                }else{
                    stk.push(ch);
                }
                
            }
        }
        int open = 0;
        int close =0;
        while(!stk.isEmpty()){
            if(stk.pop()=='{'){
                open++;
            }else{
                close++;
            }
        }
        return (open+1)/2 + (close+1)/2;
    }
}