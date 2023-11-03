package linearSearch;

// import java.lang.reflect.Array;

import java.util.Arrays;

public class Even_Digits_InArray {
    public static void main(String[] args) {
        int[] nums = {2347, 5, 6, 78, 90};
        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int nodigit = digits(num);
        return nodigit % 2 == 0;
    }

    static int digits(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num = num / 10;
        }
        return digit;
    }

}
