package linearSearch;

import java.util.Arrays;

public class Linear_Search_2DArray {
    public static void main(String[] args) {
        int[][] nums = {{23, 45, 67},
                {34, 56, 34},
                {34, 51}
        };
        System.out.println(Arrays.toString(linearSearch2D(nums, 56)));

    }


    static int [] linearSearch2D(int[][] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
