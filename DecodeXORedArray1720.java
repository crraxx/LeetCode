package EveryDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class DecodeXORedArray1720 {
    public static void main(String[] args) {
        int[] encoded = {6, 2, 7, 3};
        System.out.println(Arrays.toString(decode(encoded, 4)));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            arr[i + 1] = encoded[i] ^ arr[i];
        }
        return arr;
    }
}
