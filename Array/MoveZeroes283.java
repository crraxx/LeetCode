package Array;

import java.util.Arrays;

public class MoveZeroes283 {
    /*
    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，
    同时保持非零元素的相对顺序。
     */
    public static void main(String[] args) {
        int[] nums = {0, 0, 1};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        /*错误揭发
         public void moveZeroes(int[] nums) {
         for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                int j = 0;
                while(j<nums.length-1){
                    nums[j]=nums[j+1];
                    j++;
                }
                nums[nums.length-1]=0;
            }
         */
        /*双指针 */
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
