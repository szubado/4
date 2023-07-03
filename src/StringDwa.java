public class StringDwa {
    public static void main(String[] args) {
        String str1 = "grtxyzoiq";
        String str2 = "xyz";
        int pos = str1.indexOf(str2);
        int kon = str1.length() - pos - str2.length();
        System.out.println(str1.substring(4));
    }
}
