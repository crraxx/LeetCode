package Stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        int temp = stack.peek();//获取栈顶元素
        System.out.println(temp);

      /*  int temp1 = stack.pop();//删除栈顶元素
        System.out.println(temp1);
        System.out.println(stack);*/

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
