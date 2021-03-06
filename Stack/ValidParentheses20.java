package Stack;

import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        String s = "(){}}{";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char c1 = stack.pop();
                    if (c == ')' && c1 != '(') {
                        return false;
                    } else if (c == ']' && c1 != '[') {
                        return false;
                    } else if (c == '}' && c1 != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
