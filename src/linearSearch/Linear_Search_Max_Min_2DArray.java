package linearSearch;

public class Linear_Search_Max_Min_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {34, 57, 89},
                {57, 1, 2},
                {45, 67, 12, 32}
        };
        System.out.println(max(arr)+" is a MAX num in 2DArray");
       // System.out.println("@(@)@(@)(@)@(@)@(@)@(@)");
        System.out.println(min(arr)+ " is a MIN num in 2DArray");
    }
     // Find max num in 2D Array
    static int max(int[][] nums) {
        int max1 = nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] > max1) {
                    max1 = nums[i][j];
                }
            }
        }
        return max1;
    }
    //Find min num in 2D Array
    static int min(int[][] nums) {
        int min1 = nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] < min1) {
                    min1 = nums[i][j];
                }
            }
        }
        return min1;
    }
}
