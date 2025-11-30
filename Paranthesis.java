class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> stck = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stck.push(ch);
            }else if(stck.isEmpty()) return false;
            else{
                if(ch == ')' && stck.peek() != '('){
                    return false;
                }
                else if(ch == '}' && stck.peek() != '{'){
                    return false;
                }else if(ch == ']' && stck.peek() !='[') {
                    return false;
                }
                stck.pop();
            }
        }
        return stck.isEmpty()? true:false;
    }
}
