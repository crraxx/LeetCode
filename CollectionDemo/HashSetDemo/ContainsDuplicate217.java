package CollectionDemo.HashSetDemo;

import java.util.HashSet;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums) {
                set.add(num);
        }
        if (set.size()!= nums.length){
            return true;
        }
        return false;
    }
}
