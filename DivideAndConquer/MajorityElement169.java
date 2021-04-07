package DivideAndConquer;

public class MajorityElement169 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        return getMajority(nums,0, nums.length-1);
    }

    private static int getMajority(int[] nums,int left,int right){
        if (left == right) {
            return nums[left];
        }
        int mid = left + (right-left)/2;
        int leftMajor = getMajority(nums,left,mid);
        int rightMajor = getMajority(nums,mid+1,right);

        if (leftMajor == rightMajor) {
            return leftMajor;
        }

        int leftCount = 0;
        int rightCount = 0;
        for (int i = left; i <= right ; i++) {
            if (nums[i] == leftMajor){
                leftCount++;
            }else if (nums[i] == rightMajor){
                rightCount++;
            }
        }
        return leftCount>rightCount?leftMajor:rightMajor;
    }
}
