package DynamicProgramming;

public class MaximumSubarray53 {
    public static void main(String[] args) {
        int[] proce = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(proce));
    }
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(nums[i],pre+nums[i]);
            max = Math.max(max,pre);
        }
        return max;
    }
}
