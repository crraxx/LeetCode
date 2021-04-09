package EveryDay;

import java.util.Arrays;

public class add166 {
    public static void main(String[] args) {
        int[] digits = {13};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        //for循环处理结尾为9,或者是其他数字的
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            //如果最后一位不是9,末尾+1后直接返回
            if (digits[i] != 0) {
                return digits;
            }
        }
        //适用于全部由9组成得,长度需+1,第一位设为1
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
