package CollectionDemo.HashTableDemo;

import java.util.HashMap;
import java.util.Hashtable;

public class IntegerToRoman12 {
    public static void main(String[] args) {
        int s = 20;
        System.out.println(intToRoman(s));
    }

    public static String intToRoman(int num) {
        String s = "";
        int[] key = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] value = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        while(num != 0){
            for (int i = key.length-1; i >= 0; i--) {
                if(num >= key[i]) {
                    num -= key[i];
                    s += value[i];
                    break;
                }
            }
        }
        return s;
    }
}
