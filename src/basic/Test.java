package basic;

import oop.classjava.Bicycle;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by bsse0 on 8/1/2017.
 */
public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long k = in.nextLong();
        long result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
    }

    static long buyMaximumProducts(int n, long k, int[] a) {
        long count = 0;
        long cost = 0;
        for (int i = 1; i <= n; i++) {
            cost += a[i-1] * i;
            count += i;
            if (cost > k) {
                while (cost > k) {
                    cost -= a[i-1];
                    count--;
                }
                return count;
            }
        }

        return count;
    }

    public static int sumArray(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++)
            sum += n[i];
        return sum;
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}