package EveryDay;

import java.util.Arrays;

public class DecodeXORedPermutation1734 {
    public static void main(String[] args) {
        int[] encoded = {6, 5, 4, 6};
        System.out.println(Arrays.toString(decode(encoded)));
    }

    public static int[] decode(int[] encoded) {
        int n = encoded.length;
        int[] decode = new int[n + 1];
        //求1到n+1的所有数异或
        int all = 0;
        for (int i = 0; i <= n + 1; i++) {
            all ^= i;
        }
        //求编码后的索引为奇数位的异或
        int odd = encoded[1];
        for (int j = 3; j < n; j += 2) {
            odd ^= encoded[j];
        }
        //求编码前的第一位数
        int first = odd ^ all;
        decode[0] = first;
        //遍历求出其他的编码前的数
        for (int z = 0; z < n; z++) {
            decode[z + 1] = decode[z] ^ encoded[z];
        }
        return decode;
    }
}
