package NiuKe;

public class 第一个只出现一次的字符 {

    public static void main(String[] args) {
        String str = "NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp";
        System.out.println(FirstNotRepeatingChar(str));
    }

    public static int FirstNotRepeatingChar(String str) {
        int[] c = new int[60];
        for(int i =0;i<str.length();i++){
            c[str.charAt(i)-'A']++;
        }
        for(int i =0;i<str.length();i++){
            if(c[str.charAt(i)-'A']==1){
                return i;
            }
        }
        return 0;
    }
}
