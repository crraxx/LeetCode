package CollectionDemo.HashTableDemo;

import java.util.HashMap;

public class RomanToInteger13 {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        for (int i = 0; i < s.length()-1; i++) {
            if (hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i+1))){
                sum -=hashMap.get(s.charAt(i));
            }else if(hashMap.get(s.charAt(i)) >= hashMap.get(s.charAt(i+1))){
                sum +=  hashMap.get(s.charAt(i));
            }
        }

        return sum+=hashMap.get(s.charAt(s.length()-1));
    }
}
