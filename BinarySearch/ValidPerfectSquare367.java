package BinarySearch;

public class ValidPerfectSquare367 {

    public static void main(String[] args) {
        int num = 808201;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        if (num<2){
            return true;
        }
        long index = 2;
        long max = num/2;
        while(index <= max){
            long mid = index+(max-index)/2;
            if(mid * mid < num){
                index = mid+1;
            }else {
                max = mid-1;
            }
            if(mid * mid == num){
                System.out.println(mid);
                return true;
            }
        }
        return false;
    }
}
