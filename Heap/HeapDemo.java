package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        minHeap.add(10);
        minHeap.add(8);
        minHeap.add(9);
        minHeap.add(11);
        minHeap.add(2);

        maxHeap.add(10);
        maxHeap.add(8);
        maxHeap.add(9);
        maxHeap.add(11);
        maxHeap.add(2);

        System.out.println(minHeap.toString());
        System.out.println(maxHeap.toString());

        //取堆顶元素
        minHeap.peek();
        maxHeap.peek();

        //删除堆顶元素，并返回
        minHeap.poll();
        maxHeap.poll();

        //长度
        minHeap.size();
        maxHeap.size();

        //迭代器
        while ( !minHeap.isEmpty()){
            System.out.println(minHeap.poll());
        }

        while ( !maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }
    }



}
