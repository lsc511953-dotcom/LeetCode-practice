import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        //奇数个括号肯定不是有效括号
        if(s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            //如果是左括号
            if(c == '(') {
                stack.push(')');
            }else if(c == '{') {
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }
            //如果是右括号
            //栈为空,说明右括号多了
            else{
                if(stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}