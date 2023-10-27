package linearSearch;

public class Linear_Search_InString {
    public static void main(String[] args) {
        System.out.println(LinearSearchinString("", 'a'));
    }

    static String LinearSearchinString(String name, char letter) {

        String dup = "";
        if (name.isEmpty()) {
            return "There is nothing in";
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == letter) {
                dup = dup + name.charAt(i);
                return dup + " yeah! is there cool buddy";
            }
        }
        return letter + " is not there";
    }
}
