package CollectionDemo.HashTableDemo;

import java.util.HashMap;
import java.util.Hashtable;

public class RansomNote383 {
    public static void main(String[] args) {
        String ransomNote = "azxcsfdgsgfdgvcsvsac";
        String magazine = "aadvdacvbxdfgcvbfvxcvbfdgtgfsertyhxbgzgrthyjukilbvcbvvbnSghdgzxsdsfavfdgfsdfgcb";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!hashMap.containsKey(ransomNote.charAt(i))) {
                hashMap.put(ransomNote.charAt(i), 1);
            } else {
                hashMap.put(ransomNote.charAt(i), hashMap.get(ransomNote.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < magazine.length(); i++) {
            if (hashMap.containsKey(magazine.charAt(i))) {
                if (hashMap.get(magazine.charAt(i)) - 1 != 0) {
                    hashMap.put(magazine.charAt(i), hashMap.get(magazine.charAt(i)) - 1);
                } else {
                    hashMap.remove(magazine.charAt(i));
                }
            }
        }
        return hashMap.isEmpty();
    }
}
