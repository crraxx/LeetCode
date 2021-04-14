package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NextGreaterElementI496 {
    public static void main(String[] args) {
        int num1[] = {4, 1, 2};
        int num2[] = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(num1, num2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            for (; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    break;
                }
            }
            while (j< nums2.length){
                if (nums2[j] > nums1[i]){
                    nums3[i] = nums2[j];
                    break;
                }else{
                    j++;
                }
            }
            if(j == nums2.length){
                nums3[i] = -1;
            }
        }
        return nums3;
    }
}
