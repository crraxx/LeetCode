package EveryDay;

public class FindPeakElement162 {
    public static void main(String[] args) {

    }

    public static int findPeakElement(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length - 1;
    }
}
