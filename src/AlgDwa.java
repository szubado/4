public class AlgDwa {
    public static void main(String[] args) {
        String str = "222abyyycdXXX";
        int sum = 0;
        int length = str.length();
        System.out.println(str.length());
        System.out.println(str.substring(13));
        if (length > 3) {
            for (int i = 0; i < length - 2; i++) {
                if(str.substring(i, i+1).equals(str.substring(i+1, i+2))
                        && (str.substring(i +1 , i+2).equals(str.substring(i+2, i+3)))) {
                    sum ++;
                }
            }
        }
        System.out.println(sum);
    }
}