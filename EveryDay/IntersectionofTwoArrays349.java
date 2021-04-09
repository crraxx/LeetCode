package EveryDay;

import java.util.*;

public class IntersectionofTwoArrays349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        int[] b ={};
        if (nums1.length==0 || nums1==null||nums2.length==0 || nums2==null){
            return b;
        }

        for (int i = 0; i < nums1.length; i++) {
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.isEmpty()) {
                break;
            }
            if (set.contains(nums2[i])) {
                res.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        b = new int[res.size()];
        int i = 0;
        for (int num:res) {
            b[i] = num;
            i++;
        }
        return b;
    }
}
