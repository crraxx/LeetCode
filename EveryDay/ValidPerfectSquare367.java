package EveryDay;

public class ValidPerfectSquare367 {

    public static void main(String[] args) {
        int num = Integer.MAX_VALUE;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int index = 0;
        while(index != 100000){
            if(index*index == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
