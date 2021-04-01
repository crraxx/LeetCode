package Array;

import org.omg.CORBA.Object;

public class MyArr<T> {

    public T[] data;//数据容器
    public int size;//实际存放元素得个数

    public MyArr() {
        this(10);
    }

    public MyArr(int cap) {
        data = (T[]) new Object[cap];
        size = 0;
    }

    //获取数组中存放元素的个数
    public int geiSize() {
        return size;
    }

    //数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //向末尾添加元素
    public void addTail(T ele) throws Exception {
        add(ele, size);
    }

    //向数组中指定位置添加元素
    public void add(T ele, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new IllegalAccessException("index is worry");
        }
        if (size == data.length) {
            throw new IllegalAccessException("Array is full");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = ele;
        size++;
    }

    //想尾部添加元素
    public void addHead(T ele) throws Exception {
        if (size == data.length) {
            throw new IllegalAccessException("Array is full");
        }
        add(ele, 0);
    }

    //获取指定位置的元素
    public T getEle(int index) throws IllegalAccessException {
        if (index < 0 || index > size) {
            throw new IllegalAccessException("index is worry");
        }
        return data[index];
    }

    //修改指定位置的元素
    public void upEle(int index, T ele) throws IllegalAccessException {
        if (index < 0 || index > size) {
            throw new IllegalAccessException("index is worry");
        }
        data[index] = ele;
    }

    //删除指定位置的元素
    public void delete(int index) throws IllegalAccessException {
        if (index < 0 || index > size) {
            throw new IllegalAccessException("index is worry");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    //判断是否包含某元素
    public boolean contain(T ele) {
        boolean flag = false;
        for (int i = 0; i < size - 1; i++) {
            if (data[i] == ele) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //获取指定元素的索引
    public int getIndex(T ele) {
        int flag = -1;
        for (int i = 0; i < size - 1; i++) {
            if (data[i] == ele) {
                flag = i;
                break;
            }
        }
        return flag;
    }
}
