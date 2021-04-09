package EveryDay.摩尔投票法;

import java.util.HashMap;

public class MajorityElement169 {
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int temp = nums[0];
        int count = 0;
        for (int num:nums) {
            if (temp == num){
                count++;
            }else if(--count ==0){
                temp = num;
                count = 1;
            }
        }
        return temp;
    }
}

