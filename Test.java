import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        BigInteger sum = BigInteger.valueOf(0);
        int n = num.length;
        for (int i = 0; i < n; i++) {
            BigInteger radix = BigInteger.valueOf((long) (Math.pow(10, n-1-i)));
            sum.add(radix.multiply(BigInteger.valueOf(num[i])));
        }
        sum.add(BigInteger.valueOf(k));

        List<Integer> newArray = new ArrayList<>();
        while (sum.compareTo(BigInteger.ZERO) > 0) {
            newArray.add(0, sum.mod(BigInteger.TEN).intValue());
            sum = sum.divide(BigInteger.TEN);
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        List<Integer> output = addToArrayForm(num,k);
        System.out.println(output);
    }
}