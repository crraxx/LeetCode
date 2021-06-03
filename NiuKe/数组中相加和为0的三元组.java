package NiuKe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 数组中相加和为0的三元组 {

    public ArrayList<ArrayList<Integer>> threeSum(int[] array) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Arrays.stream(array).forEach(arr->{
            if(!hashMap.containsKey(arr)){
                hashMap.put(arr,1);
            }else{
                hashMap.put(arr,hashMap.get(arr)+1);
            }
        });
    return null;
    }
}
