 package linearSearch;

public class Linear_Search_numbers {
    public static void main(String[] args) {
int [] number ={23,56,78,987,654,345};
        System.out.println(linerSearch(number,97));
        System.out.println("_+_+_+_+_+_+_+_+_+_");
        System.out.println(linerSearch2(number,56));

    }

    // get value
    public static String linerSearch(int [] nums,int targetValue) {
        if(nums.length == 0 ){
            return "Empty";
        }
        int get =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==targetValue) {
                get = nums[i];
                return get+" is there";
            }
        }
        return get+" is not there" ;
    }
    //get index
    public static int linerSearch2(int [] nums,int targetValue) {
        if(nums.length == 0 ){
            return -1;
        }
        int get =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==targetValue) {
                return i;
            }
        }
        return -1;
    }

}
