package CollectionDemo.HashTableDemo;

public class FindTheDifference389 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        /*HashMap<Character, Integer> map = new HashMap<>();
        char[] c = new char[s.length()];
        char[] c1 = new char[t.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            c1[i] = t.charAt(i);
        }
        for (char temp : c) {
            map.put(temp, map.get(temp) - 1);//存在了,获取出现的次数并加一存放进哈希表中
        }
        for (char temp1 : c1) {
            map.put(temp1, map.get(temp1) + 1);//存在了,获取出现的次数并加一存放进哈希表中
        }
        for (char key : map.keySet()) {//遍历key
            if (map.get(key) == 1) {//获取每个key对应的数值是否大于1
                return key;
            }
        }
        return ' ';*/
        int [] hashTable = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i)-'a';
            hashTable[temp] = hashTable[temp]-1;
        }
        for (int i = 0; i < t.length(); i++) {
            int temp = t.charAt(i)-'a';
            hashTable[temp] = hashTable[temp]+1;
        }
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != 0){
                return (char)('a'+i);
            }
        }
        return 'a';
    }
}
