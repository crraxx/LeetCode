package EveryDay;

import java.util.Arrays;
import java.util.Stack;

public class ReverseOnlyLetters917 {
    public static void main(String[] args) {
        String str = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(str));
    }

    public static String reverseOnlyLetters(String S) {
        /*char[] c = S.toCharArray();//字符串转为char数组类型
        int i = 0;
        int j = c.length - 1;
        while (i <= j) {
            if (!Character.isLetter(c[i])){//判断char元素是否为字母
                i++;
                continue;
            }else{
                if (!Character.isLetter(c[j])){
                    j--;
                    continue;
                }else{
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                    i++;
                    j--;
                }
            }
        }
        return new String(c);//char数组转为String类型*/
        Stack<Character> letter = new Stack<>();
        for (char c:S.toCharArray()) {
            if (Character.isLetter(c)){
                letter.push(c);
            }
        }
        StringBuffer result = new StringBuffer();
        for (char c:S.toCharArray()) {
            if (Character.isLetter(c)){
                result.append(letter.pop());
            }else{
                result.append(c);
            }
        }
        return new String(result);
    }
}
