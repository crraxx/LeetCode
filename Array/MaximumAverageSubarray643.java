package Array;

public class MaximumAverageSubarray643 {

    public static void main(String[] args) {
        int [] nums = {-1};
        System.out.println(findMaxAverage(nums,1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp += nums[i];
        }
        //如果是负数,在此处求最大数,为0,所有应直接将结果赋值给max
        max = temp;
        for (int i = k,j=0; i < nums.length; i++,j++) {
            temp=temp-nums[j]+nums[i];
            max = Math.max(max,temp);
        }
        double x = (max*1.0)/ k;
        return x;
    }
}
