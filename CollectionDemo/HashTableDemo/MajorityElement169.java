package CollectionDemo.HashTableDemo;

import java.util.HashMap;

public class MajorityElement169 {
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }
        for (int num : hashMap.keySet()) {
            if (hashMap.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;
    }
}

