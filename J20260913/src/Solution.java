import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens) {
            if(isOperation(s)) {
                stack.push(Integer.parseInt(s));
            }else {
                //不是操作数,是运算符
                int num2 = stack.pop();//第一次出来的放运算符右边
                int num1 = stack.pop();//第二次出来的放运算符左边
                switch (s) {
                    case "+" :
                        stack.push(num1 + num2);
                        break;
                    case "-" :
                        stack.push(num1 - num2);
                        break;
                    case "*" :
                        stack.push(num1 * num2);
                        break;
                    case "/" :
                        stack.push(num1 / num2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    private boolean isOperation(String s) {
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            return false;
        }else{
            return true;
        }
    }
}