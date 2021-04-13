package SlideWindow;

public class TheSmallestSubArray209 {
    public static void main(String[] args) {
        int s =7;
        int [] nums = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(new TheSmallestSubArray209().minSubArrayLen(s,nums));;

    }

    public int minSubArrayLen(int s, int[] nums) {
        int res = nums.length + 1;//定义标记，最小字符串的长度
        int j = 0;
        int i = 0;
        int tatal = 0;//求和
        if (nums.length==0){
            return 0;
        }
        while(j<nums.length){
            tatal +=nums[j];
            j++;
            while(tatal>=s){
                res=Math.min(res,j-i);//求最小长度
                tatal-=nums[i];
                i++;
            }
        }

        //如果没有找到最小字符串的和>7，判断res是否为当初定义的，如果是说明没找到返回0
        if (res == nums.length+1){
            return 0;
        }else{
            return res;
        }
    }

}
