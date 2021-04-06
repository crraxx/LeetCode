package CollectionDemo.HashTableDemo;

import java.util.HashMap;

public class SumUniqueElements1748 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                hashMap.put(num, hashMap.get(num) + 1);
            }
        }
        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) == 1) {
                sum += key;
            }
        }
        return sum;
    }
}
