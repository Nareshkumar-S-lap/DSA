package linearSearch;

public class MaxiNumber_2DArray {
    public static void main(String[] args) {
        int[][] number = {{1, 3, 4},
                {2, 1, 2},
                {1, 1, 1}};
        System.out.println(max(number));
    }

    static int max(int[][] num) {
        int ans = Integer.MIN_VALUE;
        // int sum = 0;
        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            for (int j = 0; j < num[i].length; j++) {
                sum = sum + num[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
/*
static int max(int[][] num) {
        int ans = Integer.MIN_VALUE;
        // int sum = 0;
    for (int[] ints : num) {
        int sum = 0;
        for (int anInt : ints) {
            sum = sum + anInt;
        }
        if (sum > ans) ans = sum;
    }
        return ans;
    }
}

 */