package EveryDay;

public class P132attern456 {
    public static void main(String[] args) {
        int[] nums = new int[1000000];

        System.out.println(find132pattern(nums));
    }

    public static boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int j = 2; j < nums.length ; j++) {
            int i = 0;
            for (; i < j; i++) {
                if (nums[i] < nums[j]) {
                    break;
                }
            }
            for (int k = i + 1; k < j; k++) {
                if (nums[k] > nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
