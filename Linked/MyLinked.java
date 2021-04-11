package Linked;


import java.util.Random;

public class MyLinked<T> {

    //链表中数据的数据结构
    private class Node {
        T ele;
        Node next;//指向下一个节点

        public Node(T ele) {
            this.ele = ele;
            this.next = null;
        }

        public Node() {
            this(null);
        }
    }

    //链表中实际存放元素的个数
    private int size;
    //链表的头
    private Node dummyHead;//虚拟头结点

    public MyLinked() {
        size = 0;
        dummyHead = new Node(null);
    }

    //获取元素个数
    public int getSize() {
        return size;
    }

    //链表是否为空
    public boolean isEmpyt() {
        return size == 0;
    }

    //在链表的头部增加节点
    public void addHead(T ele) {
        //第一步创建节点
        Node node = new Node(ele);
        //node.next = head;
        //head = node;
        node.next = dummyHead.next;
        dummyHead.next = node;
        size++;
    }

    //在任意位置添加节点
    public void add(int index, T ele) {

        Node node = new Node(ele);
        //找到上一个节点
        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        node.next = pre.next;
        pre.next = node;
        size++;
    }

    //在链表尾部添加节点
    public void addTail(T ele) {
        add(size - 1, ele);
    }

    //获取头结点元素
    public T getHead(){
        return get(0);
    }
    //获取指定位置的元素
    public T get(int index){
        Node pre = new Node();
        pre = dummyHead.next;
        for (int i = 0; i < index; i++) {
            pre= pre.next;
        }
        return pre.ele;
    }

    //获取尾结点元素
    public T getTail(){
        return get(size-1);
    }

    //查找链表中是否包含某元素
    public boolean contain(T ele){
        boolean flag = false;
        Node cur = dummyHead.next;
        while(cur.next != null){
            cur = cur.next;
            if (cur.ele.equals(ele)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    //更新指定位置的元素
    public void upEle(int index , T ele){
        Node cur = new Node();
        cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.ele = ele;
    }

    //删除指定位置元素
    public T delete(int index){
        Node pre = new Node();
        Node del = new Node();
        pre= dummyHead.next;
        for (int i = 0; i < index-1; i++) {
            pre = pre.next;
            del = pre.next;
        }
        T result = pre.next.ele;
        pre.next = del.next;
        del.next = null;
        return result;
    }

    //链表的遍历
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null){
            result.append(cur.ele + "-->");
            if (cur.next ==null) {
                result.append("NULL");
            }
            cur = cur.next;
        }
            return result.toString();
    }

    public static void main(String[] args) {
        MyLinked<Integer> myLinked = new MyLinked();
        Random random = new Random();
        int num = 5;
        for (int i = 0; i < num; i++) {
            myLinked.addHead(random.nextInt(100));
        }
        System.out.println(myLinked.toString());
        System.out.println(myLinked.getHead());
        System.out.println(myLinked.getTail());
        System.out.println(myLinked.get(2));
        System.out.println(myLinked.contain(87));
        System.out.println(myLinked.delete(2));
        System.out.println(myLinked.toString());
    }
}
