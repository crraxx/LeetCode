package SlideWindow;

import java.util.HashSet;

public class MaxVowels1456 {
    public static void main(String[] args) {
        String s = "";
        int k = 4;
        System.out.println(new MaxVowels1456().maxVowels(s, k));
    }

   /* public int maxVowels(String s, int k) {
        //判断字符串是否为0
        if (s.length() < k || s.length() == 0) {
            return 0;
        }
        //创建hashset 将元音字母添加进去
        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add('a');
        hashSet.add('e');
        hashSet.add('i');
        hashSet.add('o');
        hashSet.add('u');
        int res = 0;//每组字符串中的元音字母个数
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (hashSet.contains(s.charAt(i))) {
                count++;
            }
        }
        res = Math.max(res, count);
        for (int i = k; i < s.length(); i++) {
            if (hashSet.contains(s.charAt(i - k))) {
                count--;
            }
            if (hashSet.contains(s.charAt(i))) {
                count++;
            }
            res = Math.max(res, count);
        }
        return res;
    }*/

    public int maxVowels(String s, int k) {
        if (s.length() == 0){
            return 0;
        }
        int res = 0;
        int count = 0;
        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add('a');
        hashSet.add('e');
        hashSet.add('i');
        hashSet.add('o');
        hashSet.add('u');
        for (int i = 0; i < k; i++) {
            if (hashSet.contains(s.charAt(i))){
                count++;
            }
        }
        res = Math.max(res,count);
        for (int i = k; i < s.length(); i++) {
            if (hashSet.contains(s.charAt(i-k))){
                count--;
            }
            if (hashSet.contains(s.charAt(i))){
                count++;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}

