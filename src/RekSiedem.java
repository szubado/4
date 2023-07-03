public class RekSiedem {
    public static void main(String[] args) {
        String abc = "ccaabc";
        while (abc.length() > 1) {
            System.out.println(abc);
            abc = skracanie(abc);
        }
        System.out.println(abc);
    }

    public static String skracanie(String str) {
        if (str.length() < 2) {
            return str;

        } else if (str.substring(0, 2).equals("bc") || str.substring(0, 2).equals("cb")) {
            return "a" + skracanie(str.substring(2));
        } else if (str.substring(0, 2).equals("ac") || str.substring(0, 2).equals("ca")) {
            return "b" + skracanie(str.substring(2));
        } else if (str.substring(0, 2).equals("ab") || str.substring(0, 2).equals("ba")){
            return "c" + skracanie(str.substring(2));
        }
        else {
            return str.substring(0,1) + skracanie(str.substring(1));
        }
    }
}
