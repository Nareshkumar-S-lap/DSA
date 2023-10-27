package linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
      int [] numbers ={23,45,78,90,0,87,54};
        System.out.println(linearSearchInRange(numbers,0,4,5));

    }

    static String linearSearchInRange(int[] nums, int target, int start, int end) {
        if (nums.length == 0) {
            return "not have in arr";
        }
        for (int i = start; i < end; i++) {
            if (nums[i] == target) {
                int get = nums[i];
                return target + " is in";
            }
        }
        return target + " is not in range";
    }
}
