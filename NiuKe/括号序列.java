package NiuKe;

import java.util.Stack;

public class 括号序列 {

    public static void main(String[] args) {
        System.out.println(isValid("}(])[{(}([[}])}]))})]]({{(])"));
    }

    public static boolean isValid(String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
                stack.push(c[i]);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                if (c[i] != ')' & stack.peek()=='(' ){
                    return false;
                }
                if (c[i] != ']' & stack.peek()=='[' ){
                    return false;
                }
                if (c[i] != '{' & stack.peek()=='}' ){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty()?true:false;

    }
}
