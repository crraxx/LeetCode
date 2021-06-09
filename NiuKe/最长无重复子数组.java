package NiuKe;

import java.util.Arrays;
import java.util.HashMap;

public class 最长无重复子数组 {

    public int maxLength(int[] arr) {
        // write code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                j = Math.max(j,map.get(arr[i])+1);
            }
            map.put(arr[i],i);
            len = Math.max(len,i-j+1);
        }
        return len;
    }
}
