public class SqrtX {

    public static int mySqrt(int x) {
        long left = 1;
        long right = x;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right;
    }

    public static void main(String[] args) {
        int x = 8;

        System.out.println(mySqrt(x));
    }
}
