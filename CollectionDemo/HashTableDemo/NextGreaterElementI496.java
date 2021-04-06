package CollectionDemo.HashTableDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI496 {
    public static void main(String[] args) {
        int num1[] = {4, 1, 2};
        int num2[] = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(num1, num2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                int temp = stack.pop();
                hashMap.put(temp, nums2[i]);
            }
            stack.add(nums2[i]);
        }
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            hashMap.put(temp, -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = hashMap.get(nums1[i]);
        }
        return res;
    }
}
