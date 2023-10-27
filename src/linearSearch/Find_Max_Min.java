package linearSearch;

public class Find_Max_Min {
    public static void main(String[] args) {
        int[] nums = {1, 56, 78, 98, 0, -1, -0};
        System.out.println(max(nums) + " is max function ");
        System.out.println("@!@!@!@!@!@!@!@!");
        System.out.println(min(nums) + " is min function");
    }

    //Find a min value using linearSearch
    static int min(int[] nums) {
        int assumeMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < assumeMax) {
                assumeMax = nums[i];
            }
        }
        return assumeMax;
    }

    //Find a max value using linearSearch
    static int max(int[] nums) {
        int assumeMin = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > assumeMin) {
                assumeMin = nums[i];
            }
        }
        return assumeMin;
    }

}
