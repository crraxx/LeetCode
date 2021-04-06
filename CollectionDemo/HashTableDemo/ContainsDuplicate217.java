package CollectionDemo.HashTableDemo;

import java.util.HashMap;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        //key存出现的数字,value存每个数字出现的次数
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:nums) {
            if (  !map.containsKey(num) ){//判断hash表中是否已经存储钙元素
                map.put(num,1);//没有则key = 数字 , value = 出现次数一次
            }else{
                map.put(num,map.get(num)+1);//存在了,获取出现的次数并加一存放进哈希表中
            }
        }
        for (int key : map.keySet()) {//遍历key
            if (map.get(key) > 1){//获取每个key对应的数值是否大于1
                return true;
            }
        }
        return false;
    }
}
