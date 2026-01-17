class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
          Stack<Character> stk = new Stack<>();
          for(char c : s.toCharArray()){
              if(c == ')'){
                  if(stk.peek()=='(') return true;
                  char p = stk.pop();
                  while(!stk.isEmpty() && p!='('){
                      p=stk.pop();
                  }
              }else if(!Character.isLetter(c)){
                  stk.push(c);
              }
          }
          return false;
    }
}
