package Heap;

import org.omg.CORBA.INTERNAL;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementinAnArray215 {
    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,1));
    }
    public static int findKthLargest(int[] nums, int k) {
        int max = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            max = maxHeap.poll();
        }
        return max;
    }
}
