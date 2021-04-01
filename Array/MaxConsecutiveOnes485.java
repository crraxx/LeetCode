package Array;
/*
给定一个二进制数组， 计算其中最大连续1的个数。
 */
public class MaxConsecutiveOnes485 {
    public static void main(String[] args) {
        int [] nums = {1,1,0,0,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
//只需要求最长的1的个数,不用考虑0的个数
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int pre =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                count++;
            }else{
                pre=Math.max(count,pre);
                count=0;
            }
        }
        pre=Math.max(count,pre);
        return pre;
    }
}
