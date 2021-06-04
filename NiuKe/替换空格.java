package NiuKe;

public class 替换空格 {


    public static void main(String[] args) {
        String str = " we are happy ";
        System.out.println(replaceSpace(str));
    }
    public static String replaceSpace (String s) {
        String sub = "%20";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c==' '){
                stringBuffer=stringBuffer.append(sub);
            }else{
                stringBuffer=stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }
}
