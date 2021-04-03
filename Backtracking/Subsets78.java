package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }

    /*暴力破解法
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int i : nums){
            List<List<Integer>> subset = new ArrayList<>();
            for (List<Integer> list : result){
                List<Integer> temp = new ArrayList<>(list);
                temp.add(i);
                subset.add(temp);
            }
            for (List<Integer> l :subset){
                result.add(l);
            }
        }
        return result;
    }*/

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 1; i < nums.length; i++) {
            backTrack(nums, result, i, 0, new ArrayList<>());
        }
        return result;
    }

    private static void backTrack(int[] nums, List<List<Integer>> result, int length, int index, List<Integer> subset) {
        if (subset.size() == length){
            result.add(new ArrayList<>(subset));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i] );
            backTrack(nums,result,length,i+1,subset);
            subset.remove(subset.size()-1);
        }
    }
}

