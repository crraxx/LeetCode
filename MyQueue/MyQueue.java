package MyQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.toString());

        int temp1 = queue.peek();//查找第一个元素,但不出队
        System.out.println(temp1);

        int temp2 = queue.poll();//将第一个元素出队
        System.out.println(temp2);

        System.out.println(queue.isEmpty());//是否为空
        System.out.println(queue.size());
        System.out.println(queue.toString());

        while (!queue.isEmpty()){
            int temp = queue.poll();
            System.out.println(temp);
        }
    }
}
