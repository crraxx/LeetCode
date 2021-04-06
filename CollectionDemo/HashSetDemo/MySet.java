package CollectionDemo.HashSetDemo;

import java.util.HashSet;

public class MySet {
    /*
    Set集合
    包含HashSet  LinklistSet  TreeSet
    无序   不重复
    作用:检查某一个元素是否存在
        重复元素
     */
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(3);
        set.add(5);
        set.add(5);
        set.add(2);

        System.out.println(set.toString());

        set.contains(2);

        set.remove(2);

        set.size();

    }
}
