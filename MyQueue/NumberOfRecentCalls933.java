package MyQueue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls933 {

    Queue<Integer> queue;
    public NumberOfRecentCalls933() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while(!queue.isEmpty() && t- queue.peek()>3000){
            queue.poll();
        }
        return queue.size();
    }
}
