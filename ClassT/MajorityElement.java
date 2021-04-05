package ClassT;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        int [] nums = {1,1,2,2,2};
        System.out.println(majorityElement(nums));;
    }
    public static int majorityElement(int [] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num :nums) {
            if (!map.containsKey(num)){
                map.put(num,1);
            }
            map.put(num,map.get(num)+1);
        }

        for (Integer key:map.keySet() ) {
            if (key> nums.length/2){
                return key;
            }
        }
        return -1;
    }
}
