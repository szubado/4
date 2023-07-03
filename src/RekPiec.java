public class RekPiec {
    public static void main(String[] args) {
        System.out.println(obliczBinarnie(9));
    }

    public static String obliczBinarnie(int liczba) {
        if (liczba == 0) {
            return "";
        }
        else if (liczba % 2 != 0) {
            return obliczBinarnie(liczba / 2) + "1";
        }
        else {
            return obliczBinarnie(liczba / 2) + "0";
        }
    }
}
