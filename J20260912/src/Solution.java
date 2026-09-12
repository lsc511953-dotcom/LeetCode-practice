import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        //奇数个括号肯定不是有效括号
        if(s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else{
                if(stack.isEmpty()) {
                    return false;
                }

                if(stack.peek() == '(' && c == ')' || stack.peek() == '{' && c == '}' || stack.peek() == '[' && c == ']' ) {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}