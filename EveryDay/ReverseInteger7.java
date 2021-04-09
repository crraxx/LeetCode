package EveryDay;

public class ReverseInteger7 {
    public static void main(String[] args) {
        int x = -2147483648;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        long y = 0;
        int z = (int) Math.sqrt(Math.pow(x, 2));
        while (z != 0) {
            y = y * 10 + (z % 10);
            z = z / 10;
        }
        if (y < Integer.MIN_VALUE || y > Integer.MAX_VALUE) {
            return 0;
        }
        return x < 0 ? (int)-y : (int)y;
    }
}
