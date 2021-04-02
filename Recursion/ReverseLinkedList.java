package Recursion;

public class ReverseLinkedList {
    public static void main(String[] args) {
        char[] s = {'h','l','l','o','e'};
        reverseString(s);
    }
    //递归
   /* public static void function( char[] s){
        if (s==null || s.length==0){
            return;
        }
        int left = 0;
        int right=s.length-1;
        reaursion(s,left,right);
        System.out.println(s);
    }
    public static void reaursion(char[] s,int left,int right){
        if (left>=right){
            return;
        }
        reaursion(s,left+1,right-1);
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }*/

    //双指针
    public static void reverseString(char[] s) {
        for (int i = 0,j=s.length-1; i <j ; i++,j--) {
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        System.out.println(s);
    }
}
