package EveryDay;

public class ContainerWithMostWater11 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(maxArea(nums));
    }

    public static int maxArea(int[] height) {
      /*超时
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > i; j--) {
                max = Math.max(max,(j-i)*Math.min(height[i],height[j]));
            }
        }
        return max;*/
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i < j) {
            max = Math.max(max, (j - i) * Math.min(height[j], height[i]));
            if (height[i] >= height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
}
