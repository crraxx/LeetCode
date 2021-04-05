package ClassT;

public class MaxumumSubarray {
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
/*动态规划
    public static  int maxSubArray(int[] nums) {
        int pre=0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre+nums[i],nums[i]);
            max= Math.max(max,pre);
        }
        return max;
    }*/

    /*
    lSum 表示l,r以内以l为做短点的最大字段和
    rSum 表示l,r以内以r为右端点的最大字段和
    mSum表示l,r内的最大字段和
    iSum表示l,r的区间和
     */
    public static class Status {
        public int lSum, rSum, mSum, iSum;

        public Status(int lSum, int rSum, int mSum, int iSum) {
            this.lSum = lSum;
            this.rSum = rSum;
            this.mSum = mSum;
            this.iSum = iSum;
        }
    }


    public static int maxSubArray(int[] nums) {
        return getInfo(nums, 0, nums.length - 1).mSum;
    }

    public static Status getInfo(int[] a, int l, int r) {
        if (l == r) {
            return new Status(a[l], a[l], a[l], a[l]);
        }
        int m = (l + r) / 2;
        Status lSub = getInfo(a, l, m);
        Status rSub = getInfo(a, m + 1, r);
        return pushUp(lSub,rSub);
    }

    public static Status pushUp(Status l, Status r) {
        int iSum = l.iSum+r.iSum;
        int lSUm = Math.max(l.lSum,l.iSum+r.lSum);
        int rSum = Math.max(r.rSum,r.iSum+l.rSum);
        int mSum = Math.max(Math.max(l.mSum,r.mSum),l.rSum+r.lSum);
        return new Status(lSUm,rSum,mSum,iSum);
    }
}
