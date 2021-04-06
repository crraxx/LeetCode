package CollectionDemo.HashTableDemo;

import java.util.HashMap;

public class MyHash {
    public static void main(String[] args) {
        String[] hashTable = new String[4];
        HashMap<Integer,String> map = new HashMap<>();

        //数组创建的hashTable添加元素
        hashTable[1] = "王";
        hashTable[2] = "一";
        hashTable[3] = "凡";
        //hashMap创建的hashTable添加元素
        map.put(1,"王");
        map.put(2,"一");
        map.put(3,"凡");

        //更新元素
        hashTable[1] = "bishi";
        map.put(1,"bishi");

        //删除元素
        hashTable[1] = "";
        map.remove(1);

        //获取元素
        String temp = hashTable[3];
        map.get(3);

        //检查key是否存在
        map.containsKey(3);

        //长度
        map.size();

        map.isEmpty();
    }
}
