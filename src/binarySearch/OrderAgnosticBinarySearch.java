package binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] nums = {234, 56, 45, 34, 23, 12,456, 1};
        System.out.println(orAgnosticBS(nums, 1));
    }

    static int orAgnosticBS(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        // int mid = start + (end - start) / 2;
        while (start <= end) {
        //check this arr is assending and descending
            boolean isAgn = nums[start] < nums[end];
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            if (isAgn) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
